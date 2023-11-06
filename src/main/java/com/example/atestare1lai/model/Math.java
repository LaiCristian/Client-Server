package com.example.atestare1lai.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Math {
    private String first;
    private int second;


     public String getFirst() {
          return first;
     }

     public void setFirst(String first) {
          this.first = first;
     }

     public int getSecond() {
          return second;
     }

     public void setSecond(int second) {
          this.second = second;
     }

}
