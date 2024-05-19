package br.com.cod3r.ms.model;

@FunctionalInterface
public interface FieldObserver {
    public void eventOccurred(Field field, FieldEvent event);
}
