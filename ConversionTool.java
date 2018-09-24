public class ConversionTool {


    public static void main(String[] args){
    
    
    
    }
    public static float CentimetersToInches(float centimeters){
        if(centimeters < 0){
            return (float)0;
        } else{
            return (float)(centimeters / 2.5400013716);
        }
    }
    public static float InchesToCentimeters(float inches){
        if(inches < 0){
            return (float)0.0;
        }else{
            return (float)(inches*2.54);
        }
    }
    public static float FeetToMeters(float feet){
        if(feet < 0){
            return (float)0.0;
        }else{
        return (float)(feet*0.3048);
        }
    }
    public static float MetersToFeet(float meters){
        if(meters < 0){
            return (float) 0.0;
        }else{
            return (float)(meters*3.28084);
        }
    }
    public static float CelsiusToFahrenheit(float celsius){
        return 32 + (celsius * 9/5);
    }
    public static float FahrenheitToCelsius(float fahrenheit){
        return (float)(fahrenheit-32)*(float)(0.5556);
    }
    public static float MphToKph(float mph){
        if(mph < 0){
           return (float) 0.0;
         }else{
           return (float)mph * (float)1.60934;
         }
    }
    public static float KphToMph(float kph){
         if(kph < 0){
           return (float) 0.0;
         }else{
           return (float)kph / (float)1.60934;
         }         
    }
}
