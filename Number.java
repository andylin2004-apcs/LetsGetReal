public abstract class Number{
  public abstract double getValue();

  /*return 0 when this Number equals the other RealNumber
  return a negative value when this Number is smaller than the other Number
  return a positive value when this Number is larger than the other Number
  */
  public int compareTo(Number other){
    if ((double)this.getValue() == (double)other.getValue()){
      return 0;
    }else if ((double)this.getValue() < (double)other.getValue()){
      return -1;
    }else{
      return 1;
    }
  }

  /*
  *Return true when the % difference of the values
  *are within 0.00001 of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(Number other){
    double a = Math.round((double)this.getValue()*1000000);
    double b = Math.round((double)other.getValue()*1000000);
    a /= 1000000;
    b /= 1000000;
    return a == b;
  }
}
