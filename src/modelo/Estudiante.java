/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class Estudiante {

    private String nombre;
    private float examen;
    private float taller;
    private float quiz;
    private float finalGrade;

    public Estudiante() {
        this.nombre = "";
        this.examen = 0.0f;
        this.taller = 0.0f;
        this.quiz = 0.0f;
        this.finalGrade = 0.0f;
    }

    public Estudiante(String nombre, float examen, float taller, float quiz) {
        this.nombre = nombre;
        this.examen = examen;
        this.taller = taller;
        this.quiz = quiz;
        this.finalGrade = 0.0f;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getExamen() {
        return examen;
    }

    public void setExamen(float examen) {
        this.examen = examen;
    }

    public float getTaller() {
        return taller;
    }

    public void setTaller(float taller) {
        this.taller = taller;
    }

    public float getQuiz() {
        return quiz;
    }

    public void setQuiz(float quiz) {
        this.quiz = quiz;
    }

    public float getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(float finalGrade) {
        this.finalGrade = finalGrade;
    }

    public void calcularNotaFinal() {
        float examen = getExamen();
        float taller = getTaller();
        float quiz = getQuiz();
        float finalGrade = (examen * 0.6f) + (taller * 0.2f) + (quiz * 0.2f);

        setFinalGrade(finalGrade);
    }

}
