package entities;

import java.time.LocalDateTime;

public class Contract {
  private Integer number;
  private LocalDateTime date;
  private Double totalValue;

  public Contract() {

  }

    public Contract(LocalDateTime date, Integer number, Double totalValue) {

        this.date = date;
        this.number = number;
        this.totalValue = totalValue;
    }



  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public Double getTotalValue() {
    return totalValue;
  }

  public void setTotalValue(Double totalValue) {
    this.totalValue = totalValue;
  }

  

  
  
}
