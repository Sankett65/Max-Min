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

    }
