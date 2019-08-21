/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Adressen.Adres;
import Adressen.OntvangstAdres;
import Bestellingen.OrderPicking;
import Materialen.StandaardTekstLeveringsbonnen;
import New.New;
import Producten.ReceptProduct;
import static Utils.Util.BigDecimal;
import enums.AllergeenType;
import enums.BereikbaarOpDag;
import enums.BtwCode;
import enums.CcpPva;
import enums.DayOfWeek;
import enums.Eenheid;
import enums.EtiketPrintMogelijkheid;
import enums.EtiketType;
import enums.FunctieVanIngrediënt;
import enums.InhoudLeveringsbonnen;
import enums.Land;
import enums.LeveringsFrequenties;
import enums.MuntEenheid;
import enums.OpzoekenAankoopproduct;
import enums.Orderpicking;
import enums.Printertype;
import enums.ScanFrequentie;
import enums.ScannerType;
import enums.Solvabiliteit;
import enums.SoortFeestdag;
import enums.SoortFysischeEigenschap;
import enums.SoortLink;
import enums.StandaardTekstVoorType;
import enums.Taal;
import enums.VerpakkingsEenheid;
import enums.Webshop_API;
import enums.WeegschaalModel;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stefa
 */
public class DB {
    
    private static String SQL_INSERT = "";
    
    public static Connection getConnection() {
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=Protrac;integratedSecurity=true;";
            return DriverManager.getConnection(connectionUrl);
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
    public static <T> void insert(List<T> objects, String tableName, Class<T> type, boolean deletePreviousData, boolean generateId) {
        System.out.printf("START INSERTING %S%n", tableName);
        String cols = "(";
        String qms = "(";
        int i = 1;
        List<String> columns = new ArrayList();
        
        for (Field field : type.getFields()) {
            if (i == 1 && generateId) {
                System.out.println("SKIP: Generate ID");
            } else {
                if (List.class.isAssignableFrom(field.getType())) {
                    //System.out.println("SKIP: No lists!");
                } else {
                    if (New.class.isAssignableFrom(field.getType())) {
                        columns.add(field.getName() + "Id");
                    } else {
                        columns.add(field.getName());
                    }
                }
            }
            i++;
        }
        
        int size = columns.size();
        int j = 1;
        for (String col : columns) {
            if (j < size) {
                cols += col + ",";
                qms += "?, ";
            } else {
                cols += col + ")";
                qms += "? )";
            }
            j++;
        }
        
        String insert = String.format("INSERT INTO %s %s VALUES %s", tableName, cols, qms);
        SQL_INSERT = insert;
        
        executeInsert(objects, tableName, type, deletePreviousData, generateId);
    }
    
    public static <T> void executeInsert(List<T> objects, String tableName, Class<T> type, boolean deletePreviousData, boolean generateId) {
        Connection connection = getConnection();
        try {
            
            PreparedStatement statement = connection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            
            disableDatabaseConstraints(connection);
            
            if (generateId) {
                enableIdentityGeneration(connection, tableName);
            } else {
                disableIdentityGeneration(connection, tableName);
            }
            
            if (deletePreviousData) {
                clearTable(connection, tableName);
            }
            
            for (T obj : objects) {
                int i = 1;
                boolean firstField = true;
                for (Field field : type.getFields()) {
                    if (generateId && firstField) {
                        //SKIP!
                    } else {
                        if (field.getType().isEnum()) {
                            if (field.get(obj) instanceof Land) {
                                statement.setInt(i, Land.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof Eenheid) {
                                statement.setInt(i, Eenheid.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof VerpakkingsEenheid) {
                                statement.setInt(i, VerpakkingsEenheid.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof DayOfWeek) {
                                statement.setInt(i, DayOfWeek.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof Taal) {
                                statement.setInt(i, Taal.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof AllergeenType) {
                                statement.setInt(i, AllergeenType.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof BtwCode) {
                                statement.setInt(i, BtwCode.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof CcpPva) {
                                statement.setInt(i, CcpPva.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof EtiketPrintMogelijkheid) {
                                statement.setInt(i, EtiketPrintMogelijkheid.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof EtiketType) {
                                statement.setInt(i, EtiketType.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof FunctieVanIngrediënt) {
                                statement.setInt(i, FunctieVanIngrediënt.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof InhoudLeveringsbonnen) {
                                statement.setInt(i, InhoudLeveringsbonnen.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof LeveringsFrequenties) {
                                statement.setInt(i, LeveringsFrequenties.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof MuntEenheid) {
                                statement.setInt(i, MuntEenheid.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof OpzoekenAankoopproduct) {
                                statement.setInt(i, OpzoekenAankoopproduct.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof Orderpicking) {
                                statement.setInt(i, Orderpicking.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof Printertype) {
                                statement.setInt(i, Printertype.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof ScanFrequentie) {
                                statement.setInt(i, ScanFrequentie.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof ScannerType) {
                                statement.setInt(i, ScannerType.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof Solvabiliteit) {
                                statement.setInt(i, Solvabiliteit.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof SoortFeestdag) {
                                statement.setInt(i, SoortFeestdag.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof SoortFysischeEigenschap) {
                                statement.setInt(i, SoortFysischeEigenschap.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof SoortLink) {
                                statement.setInt(i, SoortLink.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof StandaardTekstVoorType) {
                                statement.setInt(i, StandaardTekstVoorType.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof StandaardTekstVoorType) {
                                statement.setInt(i, StandaardTekstVoorType.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof Webshop_API) {
                                statement.setInt(i, Webshop_API.valueOf(field.get(obj).toString()).ordinal());
                            } else if (field.get(obj) instanceof WeegschaalModel) {
                                statement.setInt(i, WeegschaalModel.valueOf(field.get(obj).toString()).ordinal());
                            }else if (field.get(obj) instanceof BereikbaarOpDag) {
                                statement.setInt(i, BereikbaarOpDag.valueOf(field.get(obj).toString()).ordinal());
                            }
                        } else if (field.getType() == int.class) {
                            statement.setInt(i, field.getInt(obj));
                        } else if (field.getType() == String.class) {
                            statement.setString(i, (String) field.get(obj));
                        } else if (field.getType() == boolean.class) {
                            statement.setBoolean(i, field.getBoolean(obj));
                        } else if (field.getType() == double.class) {
                            statement.setDouble(i, field.getDouble(obj));
                        } else if (field.getType() == Date.class) {
                            Date date = (Date) field.get(obj);
                            statement.setDate(i, date != null ? date : new Date(0));
                        } else if (field.getType() == BigDecimal.class) {
                            BigDecimal big = (BigDecimal) field.get(obj);
                            statement.setBigDecimal(i, big);
                        } else if (List.class.isAssignableFrom(field.getType())) {
                            //SKIP!
                        } else if (New.class.isAssignableFrom(type)) {
                            New idClass = (New) field.get(obj);
                            int id;
                            if (idClass != null) {
                                id = idClass.getId();
                            } else {
                                id = -1;
                            }
                            statement.setInt(i, id);
                        } else {
                            throw new IllegalArgumentException("DATA TYPE IS NOT SUPPORTED YET, ADD IT!!!");
                        }
                        i++;
                        
                    }
                    firstField = false;
                }
                
                int affectedRows = statement.executeUpdate();
                if (affectedRows > 0) {
                    if (generateId) {
                        try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                            if (generatedKeys.next()) {
                                ((New) obj).setId(generatedKeys.getInt(1));
                            }
                        }
                    }
                }
                
            }
            
            statement.closeOnCompletion();
            System.out.printf("DONE INSERTING %S%n", tableName);
            
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            enableDatabaseConstraints(connection);
            enableIdentityGeneration(connection, tableName);
            SQL_INSERT = "";
        }
    }
    
    public static void executeCustomQuery(String query) {
        try {
            Connection connection = getConnection();
            
            PreparedStatement statement = connection.prepareStatement(query);
            disableDatabaseConstraints(connection);
            statement.executeUpdate();
            statement.closeOnCompletion();
            
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void disableDatabaseConstraints(Connection connection) {
        try {
            Statement disableConstraintsStatement = connection.createStatement();
            disableConstraintsStatement.execute("exec sp_MSforeachtable \"ALTER TABLE ? NOCHECK CONSTRAINT ALL\"");
            disableConstraintsStatement.execute("exec sp_MSforeachtable \"ALTER TABLE ? DISABLE TRIGGER ALL\"");
        } catch (SQLException ex) {
            Logger.getLogger(DB.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private static void enableDatabaseConstraints(Connection connection) {
        
        try {
            Statement enableConstraintsStatement = connection.createStatement();
            enableConstraintsStatement.execute("exec sp_MSforeachtable \"ALTER TABLE ? CHECK CONSTRAINT ALL\"");
            enableConstraintsStatement.execute("exec sp_MSforeachtable \"ALTER TABLE ? ENABLE TRIGGER ALL\"");
        } catch (SQLException ex) {
            Logger.getLogger(DB.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private static void disableIdentityGeneration(Connection connection, String tableName) {
        try {
            Statement disableConstraintsStatement = connection.createStatement();
            disableConstraintsStatement.execute("SET IDENTITY_INSERT " + tableName + " ON");
        } catch (SQLException ex) {
            Logger.getLogger(DB.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void enableIdentityGeneration(Connection connection, String tableName) {
        try {
            Statement enableConstraintsStatement = connection.createStatement();
            enableConstraintsStatement.execute("SET IDENTITY_INSERT " + tableName + " OFF");
        } catch (SQLException ex) {
            Logger.getLogger(DB.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void clearTable(Connection connection, String tableName) {
        try {
            Statement clearStatement = connection.createStatement();
            clearStatement.execute("DELETE FROM " + tableName);
        } catch (SQLException ex) {
            Logger.getLogger(DB.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
}
