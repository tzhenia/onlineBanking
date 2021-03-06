package main.persistence.dao.impl.enums;
public enum TransferSQL {
    SELECT_BY_ID("SELECT t.id, t.id_card_from, t.id_card_to, t.sum, t.note, t.id_transfer_type, t.id_status, s.id, s.status, t.time FROM transfer t INNER JOIN status s ON t.id_status = s.id  WHERE t.id = ?"),
    SELECT_ALL("SELECT t.id, t.id_card_from, t.id_card_to, t.sum, t.note, t.id_transfer_type, t.id_status, s.id, s.status, t.time FROM transfer t INNER JOIN status s ON t.id_status = s.id"),
    SELECT_ALL_BY_ID_CARD_FROM("SELECT t.id, t.id_card_from, t.id_card_to, t.sum, t.note, t.id_transfer_type, t.id_status, s.id, s.status, t.time FROM transfer t INNER JOIN status s ON t.id_status = s.id WHERE t.id_card_from = ?"),
    SELECT_ALL_BY_ID_CARD_TO("SELECT t.id, t.id_card_from, t.id_card_to, t.sum, t.note, t.id_transfer_type, t.id_status, s.id, s.status, t.time FROM transfer t INNER JOIN status s ON t.id_status = s.id WHERE t.id_card_to = ?"),
    INSERT("INSERT INTO transfer (id_card_from, id_card_to, sum, note, id_transfer_type, id_status, time) values (?, ?, ?, ?, ?, ?, ?)"),
    DELETE("DELETE FROM transfer where id = ?"),
    UPDATE("UPDATE transfer SET id_card_from = ?, id_card_to = ?, sum = ?, note = ?, id_transfer_type = ?, id_status = ?, time = ? WHERE id = ?"),
    INCREASE_BALANCE("UPDATE card Set balance = balance + ? where id = ?"),
    DECREASE_BALANCE("UPDATE card Set balance = balance - ? where id = ?");

    public String QUERY;
    TransferSQL(String QUERY) {
        this.QUERY = QUERY;
    }
}
