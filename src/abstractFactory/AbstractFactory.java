package abstractFactory;

  interface Tyre {
    void message();
  }
      class LuxuryTyre implements Tyre{

          @Override
          public void message() {
              System.out.println("高端轮胎");
          }
      }
      class LowTyre implements Tyre {

          @Override
          public void message() {
              System.out.println("低端轮胎");
          }
      }
