// java wrapper for vtkLagrangianParticleTracker object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLagrangianParticleTracker extends vtkDataObjectAlgorithm
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void SetIntegrationModel_4(vtkLagrangianBasicIntegrationModel id0);
  public void SetIntegrationModel(vtkLagrangianBasicIntegrationModel id0)
  {
    SetIntegrationModel_4(id0);
  }

  private native long GetIntegrationModel_5();
  public vtkLagrangianBasicIntegrationModel GetIntegrationModel()
  {
    long temp = GetIntegrationModel_5();

    if (temp == 0) return null;
    return (vtkLagrangianBasicIntegrationModel)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetIntegrator_6(vtkInitialValueProblemSolver id0);
  public void SetIntegrator(vtkInitialValueProblemSolver id0)
  {
    SetIntegrator_6(id0);
  }

  private native long GetIntegrator_7();
  public vtkInitialValueProblemSolver GetIntegrator()
  {
    long temp = GetIntegrator_7();

    if (temp == 0) return null;
    return (vtkInitialValueProblemSolver)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGeneratePolyVertexInteractionOutput_8(boolean id0);
  public void SetGeneratePolyVertexInteractionOutput(boolean id0)
  {
    SetGeneratePolyVertexInteractionOutput_8(id0);
  }

  private native boolean GetGeneratePolyVertexInteractionOutput_9();
  public boolean GetGeneratePolyVertexInteractionOutput()
  {
    return GetGeneratePolyVertexInteractionOutput_9();
  }

  private native void SetCellLengthComputationMode_10(int id0);
  public void SetCellLengthComputationMode(int id0)
  {
    SetCellLengthComputationMode_10(id0);
  }

  private native int GetCellLengthComputationMode_11();
  public int GetCellLengthComputationMode()
  {
    return GetCellLengthComputationMode_11();
  }

  private native void SetStepFactor_12(double id0);
  public void SetStepFactor(double id0)
  {
    SetStepFactor_12(id0);
  }

  private native double GetStepFactor_13();
  public double GetStepFactor()
  {
    return GetStepFactor_13();
  }

  private native void SetStepFactorMin_14(double id0);
  public void SetStepFactorMin(double id0)
  {
    SetStepFactorMin_14(id0);
  }

  private native double GetStepFactorMin_15();
  public double GetStepFactorMin()
  {
    return GetStepFactorMin_15();
  }

  private native void SetStepFactorMax_16(double id0);
  public void SetStepFactorMax(double id0)
  {
    SetStepFactorMax_16(id0);
  }

  private native double GetStepFactorMax_17();
  public double GetStepFactorMax()
  {
    return GetStepFactorMax_17();
  }

  private native void SetMaximumNumberOfSteps_18(int id0);
  public void SetMaximumNumberOfSteps(int id0)
  {
    SetMaximumNumberOfSteps_18(id0);
  }

  private native int GetMaximumNumberOfSteps_19();
  public int GetMaximumNumberOfSteps()
  {
    return GetMaximumNumberOfSteps_19();
  }

  private native void SetMaximumIntegrationTime_20(double id0);
  public void SetMaximumIntegrationTime(double id0)
  {
    SetMaximumIntegrationTime_20(id0);
  }

  private native double GetMaximumIntegrationTime_21();
  public double GetMaximumIntegrationTime()
  {
    return GetMaximumIntegrationTime_21();
  }

  private native void SetAdaptiveStepReintegration_22(boolean id0);
  public void SetAdaptiveStepReintegration(boolean id0)
  {
    SetAdaptiveStepReintegration_22(id0);
  }

  private native boolean GetAdaptiveStepReintegration_23();
  public boolean GetAdaptiveStepReintegration()
  {
    return GetAdaptiveStepReintegration_23();
  }

  private native void AdaptiveStepReintegrationOn_24();
  public void AdaptiveStepReintegrationOn()
  {
    AdaptiveStepReintegrationOn_24();
  }

  private native void AdaptiveStepReintegrationOff_25();
  public void AdaptiveStepReintegrationOff()
  {
    AdaptiveStepReintegrationOff_25();
  }

  private native void SetGenerateParticlePathsOutput_26(boolean id0);
  public void SetGenerateParticlePathsOutput(boolean id0)
  {
    SetGenerateParticlePathsOutput_26(id0);
  }

  private native boolean GetGenerateParticlePathsOutput_27();
  public boolean GetGenerateParticlePathsOutput()
  {
    return GetGenerateParticlePathsOutput_27();
  }

  private native void GenerateParticlePathsOutputOn_28();
  public void GenerateParticlePathsOutputOn()
  {
    GenerateParticlePathsOutputOn_28();
  }

  private native void GenerateParticlePathsOutputOff_29();
  public void GenerateParticlePathsOutputOff()
  {
    GenerateParticlePathsOutputOff_29();
  }

  private native void SetSourceData_30(vtkDataObject id0);
  public void SetSourceData(vtkDataObject id0)
  {
    SetSourceData_30(id0);
  }

  private native long GetSource_31();
  public vtkDataObject GetSource()
  {
    long temp = GetSource_31();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSourceConnection_32(vtkAlgorithmOutput id0);
  public void SetSourceConnection(vtkAlgorithmOutput id0)
  {
    SetSourceConnection_32(id0);
  }

  private native void SetSurfaceData_33(vtkDataObject id0);
  public void SetSurfaceData(vtkDataObject id0)
  {
    SetSurfaceData_33(id0);
  }

  private native long GetSurface_34();
  public vtkDataObject GetSurface()
  {
    long temp = GetSurface_34();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSurfaceConnection_35(vtkAlgorithmOutput id0);
  public void SetSurfaceConnection(vtkAlgorithmOutput id0)
  {
    SetSurfaceConnection_35(id0);
  }

  private native int FillInputPortInformation_36(int id0,vtkInformation id1);
  public int FillInputPortInformation(int id0,vtkInformation id1)
  {
    return FillInputPortInformation_36(id0,id1);
  }

  private native int FillOutputPortInformation_37(int id0,vtkInformation id1);
  public int FillOutputPortInformation(int id0,vtkInformation id1)
  {
    return FillOutputPortInformation_37(id0,id1);
  }

  private native long GetMTime_38();
  public long GetMTime()
  {
    return GetMTime_38();
  }

  private native long GetNewParticleId_39();
  public long GetNewParticleId()
  {
    return GetNewParticleId_39();
  }

  public vtkLagrangianParticleTracker() { super(); }

  public vtkLagrangianParticleTracker(long id) { super(id); }
  public native long   VTKInit();

}
