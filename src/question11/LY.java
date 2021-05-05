/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author YaswantLakkaraju
 */
import java.io.*;
public class LY
{

      

    private String name;

    private int id;

          

    LY(String name, int id)

    {

              

        this.name = name;

        this.id = id;

    }

      

    @Override

    public boolean equals(Object obj)

    {

          

    // checking if both the object references are referring to the same object.

    if(this == obj)

            return true;

          

        // it checks if the argument is of the type LY by comparing the classes  of the passed argument and this object.

        // if(!(obj instanceof LY)) return false; ---> avoid.

        if(obj == null || obj.getClass()!= this.getClass())

            return false;

          

        // type casting of the argument.

        LY LY = (LY) obj;

          

        // comparing the state of argument with the state of 'this' Object.

        return (LY.name == this.name && LY.id == this.id);

    }

      

    @Override

    public int hashCode()

    {

          

        // We are returning the Insta_id as a hashcode value.

        // we can also return some other calculated value or may be memory address of the  Object on which it is invoked.

        // it depends on how you implement hashCode() method.

        return this.id;

    }

      

}
