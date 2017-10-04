package com.mwcc;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("cursoConversor")
public class CursoConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Integer codigo = null;

        try {
            codigo = Integer.valueOf(value);
        }catch (NumberFormatException e){
            if (value != null){
                for (Curso curso : CadastroTreinamentoBean.CURSOS){
                    if (codigo.equals(curso.getCodigo()))
                        return curso;
                }
            }
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value != null) {
            Curso curso = (Curso) value;
            return String.valueOf(curso.getCodigo());
        }
        return null;

    }
}
