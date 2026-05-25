// java wrapper for vtkParticleTracerBase object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkParticleTracerBase extends vtkPolyDataAlgorithm
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

  private native void PrintParticleHistories_4();
  public void PrintParticleHistories()
  {
    PrintParticleHistories_4();
  }

  private native byte[] TimeStepsArrayName_5();
  public String TimeStepsArrayName()
  {
    return new String(TimeStepsArrayName_5(), StandardCharsets.UTF_8);
  }

  private native void SetController_6(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_6(id0);
  }

  private native long GetController_7();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_7();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean GetComputeVorticity_8();
  public boolean GetComputeVorticity()
  {
    return GetComputeVorticity_8();
  }

  private native void SetComputeVorticity_9(boolean id0);
  public void SetComputeVorticity(boolean id0)
  {
    SetComputeVorticity_9(id0);
  }

  private native double GetTerminalSpeed_10();
  public double GetTerminalSpeed()
  {
    return GetTerminalSpeed_10();
  }

  private native void SetTerminalSpeed_11(double id0);
  public void SetTerminalSpeed(double id0)
  {
    SetTerminalSpeed_11(id0);
  }

  private native double GetRotationScale_12();
  public double GetRotationScale()
  {
    return GetRotationScale_12();
  }

  private native void SetRotationScale_13(double id0);
  public void SetRotationScale(double id0)
  {
    SetRotationScale_13(id0);
  }

  private native void SetIgnorePipelineTime_14(int id0);
  public void SetIgnorePipelineTime(int id0)
  {
    SetIgnorePipelineTime_14(id0);
  }

  private native int GetIgnorePipelineTime_15();
  public int GetIgnorePipelineTime()
  {
    return GetIgnorePipelineTime_15();
  }

  private native void IgnorePipelineTimeOn_16();
  public void IgnorePipelineTimeOn()
  {
    IgnorePipelineTimeOn_16();
  }

  private native void IgnorePipelineTimeOff_17();
  public void IgnorePipelineTimeOff()
  {
    IgnorePipelineTimeOff_17();
  }

  private native int GetForceReinjectionEveryNSteps_18();
  public int GetForceReinjectionEveryNSteps()
  {
    return GetForceReinjectionEveryNSteps_18();
  }

  private native void SetForceReinjectionEveryNSteps_19(int id0);
  public void SetForceReinjectionEveryNSteps(int id0)
  {
    SetForceReinjectionEveryNSteps_19(id0);
  }

  private native void SetTerminationTime_20(double id0);
  public void SetTerminationTime(double id0)
  {
    SetTerminationTime_20(id0);
  }

  private native double GetTerminationTime_21();
  public double GetTerminationTime()
  {
    return GetTerminationTime_21();
  }

  private native void SetStartTime_22(double id0);
  public void SetStartTime(double id0)
  {
    SetStartTime_22(id0);
  }

  private native double GetStartTime_23();
  public double GetStartTime()
  {
    return GetStartTime_23();
  }

  private native void SetDisableResetCache_24(boolean id0);
  public void SetDisableResetCache(boolean id0)
  {
    SetDisableResetCache_24(id0);
  }

  private native boolean GetDisableResetCache_25();
  public boolean GetDisableResetCache()
  {
    return GetDisableResetCache_25();
  }

  private native void DisableResetCacheOn_26();
  public void DisableResetCacheOn()
  {
    DisableResetCacheOn_26();
  }

  private native void DisableResetCacheOff_27();
  public void DisableResetCacheOff()
  {
    DisableResetCacheOff_27();
  }

  private native void SetIntegrator_28(vtkInitialValueProblemSolver id0);
  public void SetIntegrator(vtkInitialValueProblemSolver id0)
  {
    SetIntegrator_28(id0);
  }

  private native long GetIntegrator_29();
  public vtkInitialValueProblemSolver GetIntegrator()
  {
    long temp = GetIntegrator_29();

    if (temp == 0) return null;
    return (vtkInitialValueProblemSolver)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetIntegratorType_30(int id0);
  public void SetIntegratorType(int id0)
  {
    SetIntegratorType_30(id0);
  }

  private native int GetIntegratorType_31();
  public int GetIntegratorType()
  {
    return GetIntegratorType_31();
  }

  private native void SetStaticSeeds_32(int id0);
  public void SetStaticSeeds(int id0)
  {
    SetStaticSeeds_32(id0);
  }

  private native int GetStaticSeeds_33();
  public int GetStaticSeeds()
  {
    return GetStaticSeeds_33();
  }

  private native void SetMeshOverTime_34(int id0);
  public void SetMeshOverTime(int id0)
  {
    SetMeshOverTime_34(id0);
  }

  private native int GetMeshOverTimeMinValue_35();
  public int GetMeshOverTimeMinValue()
  {
    return GetMeshOverTimeMinValue_35();
  }

  private native int GetMeshOverTimeMaxValue_36();
  public int GetMeshOverTimeMaxValue()
  {
    return GetMeshOverTimeMaxValue_36();
  }

  private native void SetMeshOverTimeToDifferent_37();
  public void SetMeshOverTimeToDifferent()
  {
    SetMeshOverTimeToDifferent_37();
  }

  private native void SetMeshOverTimeToStatic_38();
  public void SetMeshOverTimeToStatic()
  {
    SetMeshOverTimeToStatic_38();
  }

  private native void SetMeshOverTimeToLinearTransformation_39();
  public void SetMeshOverTimeToLinearTransformation()
  {
    SetMeshOverTimeToLinearTransformation_39();
  }

  private native void SetMeshOverTimeToSameTopology_40();
  public void SetMeshOverTimeToSameTopology()
  {
    SetMeshOverTimeToSameTopology_40();
  }

  private native int GetMeshOverTime_41();
  public int GetMeshOverTime()
  {
    return GetMeshOverTime_41();
  }

  private native void SetInterpolatorType_42(int id0);
  public void SetInterpolatorType(int id0)
  {
    SetInterpolatorType_42(id0);
  }

  private native void SetInterpolatorTypeToDataSetPointLocator_43();
  public void SetInterpolatorTypeToDataSetPointLocator()
  {
    SetInterpolatorTypeToDataSetPointLocator_43();
  }

  private native void SetInterpolatorTypeToCellLocator_44();
  public void SetInterpolatorTypeToCellLocator()
  {
    SetInterpolatorTypeToCellLocator_44();
  }

  private native void SetParticleWriter_45(vtkAbstractParticleWriter id0);
  public void SetParticleWriter(vtkAbstractParticleWriter id0)
  {
    SetParticleWriter_45(id0);
  }

  private native long GetParticleWriter_46();
  public vtkAbstractParticleWriter GetParticleWriter()
  {
    long temp = GetParticleWriter_46();

    if (temp == 0) return null;
    return (vtkAbstractParticleWriter)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetParticleFileName_47(byte[] id0, int len0);
  public void SetParticleFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetParticleFileName_47(bytes0, bytes0.length);
  }

  private native byte[] GetParticleFileName_48();
  public String GetParticleFileName()
  {
    return new String(GetParticleFileName_48(), StandardCharsets.UTF_8);
  }

  private native void SetEnableParticleWriting_49(int id0);
  public void SetEnableParticleWriting(int id0)
  {
    SetEnableParticleWriting_49(id0);
  }

  private native int GetEnableParticleWriting_50();
  public int GetEnableParticleWriting()
  {
    return GetEnableParticleWriting_50();
  }

  private native void EnableParticleWritingOn_51();
  public void EnableParticleWritingOn()
  {
    EnableParticleWritingOn_51();
  }

  private native void EnableParticleWritingOff_52();
  public void EnableParticleWritingOff()
  {
    EnableParticleWritingOff_52();
  }

  private native void AddSourceConnection_53(vtkAlgorithmOutput id0);
  public void AddSourceConnection(vtkAlgorithmOutput id0)
  {
    AddSourceConnection_53(id0);
  }

  private native void RemoveAllSources_54();
  public void RemoveAllSources()
  {
    RemoveAllSources_54();
  }

  private native boolean GetForceSerialExecution_55();
  public boolean GetForceSerialExecution()
  {
    return GetForceSerialExecution_55();
  }

  private native void SetForceSerialExecution_56(boolean id0);
  public void SetForceSerialExecution(boolean id0)
  {
    SetForceSerialExecution_56(id0);
  }

  private native void ForceSerialExecutionOn_57();
  public void ForceSerialExecutionOn()
  {
    ForceSerialExecutionOn_57();
  }

  private native void ForceSerialExecutionOff_58();
  public void ForceSerialExecutionOff()
  {
    ForceSerialExecutionOff_58();
  }

  public vtkParticleTracerBase() { super(); }

  public vtkParticleTracerBase(long id) { super(id); }

}
