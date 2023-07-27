public class Max_Min {
        public String maximum(int x,int y,int z){
            if (x>y && x>z){
                return "First number is Maximum";
            }else if (y>x && y>z){
                return "Second number is Maximum";
            }else {
                return "Third number is Maximum";
            }

        }

    public String maximumFloat(float x,float y,float z){
        if (x>y && x>z){
            return "First number is Maximum";
        }else if (y>x && y>z){
            return "Second number is Maximum";
        }else {
            return "Third number is Maximum";
        }

    }

    public String maximumString(String x,String y,String z){
      if (x.equals(y) && x.equals(z)){
          return "First String is Maximum";
      } else if (y.equals(x) && y.equals(z)) {
          return "Second String is Maximum";
      }else {
          return "Third String is Maximum";
      }

    }

    }
