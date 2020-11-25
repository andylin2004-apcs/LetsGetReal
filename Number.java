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
      return (int)this.getValue()*-1;
    }else{
      return (int)this.getValue();
    }
  }

  /*
  *Return true when the % difference of the values
  *are within 0.00001 of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(Number other){
    double a = Math.round((double)this.getValue()*10000);
    double b = Math.round((double)other.getValue()*10000);
    a /= 10000;
    b /= 10000;
    return a == b;
  }
}
