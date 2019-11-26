class Gold {

  double unze = 0;
  double gramm = 0;

  void grammInUnze() {
    unze = gramm / 31.1034768;
  }
  double bekommeGoldwert(double goldpreis) {
    return unze*goldpreis;
  }
}
