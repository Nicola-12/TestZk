package modules.composers;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericComposer;
import org.zkoss.zul.Div;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nicol
 */
public class Composer 
    extends 
        GenericComposer<Component>
{
    @Override
    public void doAfterCompose( Component comp ) throws Exception 
    {
        Div test = new Div();
        test.setStyle( "width: 100px; height: 100px; background-color: red;" );
        
        comp.appendChild( test );
        
        super.doAfterCompose( comp );
    }
    
}
