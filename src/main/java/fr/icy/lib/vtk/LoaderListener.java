package fr.icy.lib.vtk;

public interface LoaderListener {
    void onLoadStarted(int totalSteps);
    void onStepStarted(int stepIndex, String stepName, int totalSubSteps);
    void onStepCompleted(int stepIndex, String stepName);
    void onLoadFinished();
    void onLoadFailed(String stepName, Exception cause);
}
