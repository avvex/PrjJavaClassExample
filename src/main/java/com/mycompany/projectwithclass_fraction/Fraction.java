/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectwithclass_fraction;

/**
 *
 * @author Valentina
 */
public class Fraction {
private int ch;
private int zn;
static private int countObj = 0;



Fraction(){
    ch = 0;
    zn = 1;       
}

Fraction(int chA, int znA){
    if(znA == 0)
    {
    ch = 0;
    zn = 1;      
    }
    else
    {
    ch = chA;
    zn = znA;    
    }
}

/**
*
* @return
*/
public String ToFormatString()
{
    return ch + "/" + zn;

}


Fraction add(Fraction objF)
{
    Fraction res = new Fraction (ch * objF.zn + objF.ch * zn,zn * objF.zn);
    return res;  
}

Fraction sub(Fraction objF)
{
    Fraction res = new Fraction (ch * objF.zn + objF.ch * zn,zn * objF.zn);
    return res;        
}

boolean isEqual(Fraction objF)
{
    if(objF == null)
        return false;
    if(ch == objF.ch && zn == objF.zn)
        return true;
    return false;
}

}//End of Class

