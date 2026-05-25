// java wrapper for vtkStreamTracer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStreamTracer extends vtkPolyDataAlgorithm
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

  private native void SetStartPosition_4(double id0,double id1,double id2);
  public void SetStartPosition(double id0,double id1,double id2)
  {
    SetStartPosition_4(id0,id1,id2);
  }

  private native void SetStartPosition_5(double id0[]);
  public void SetStartPosition(double id0[])
  {
    SetStartPosition_5(id0);
  }

  private native double[] GetStartPosition_6();
  public double[] GetStartPosition()
  {
    return GetStartPosition_6();
  }

  private native void SetSourceData_7(vtkDataSet id0);
  public void SetSourceData(vtkDataSet id0)
  {
    SetSourceData_7(id0);
  }

  private native long GetSource_8();
  public vtkDataSet GetSource()
  {
    long temp = GetSource_8();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSourceConnection_9(vtkAlgorithmOutput id0);
  public void SetSourceConnection(vtkAlgorithmOutput id0)
  {
    SetSourceConnection_9(id0);
  }

  private native void SetIntegrator_10(vtkInitialValueProblemSolver id0);
  public void SetIntegrator(vtkInitialValueProblemSolver id0)
  {
    SetIntegrator_10(id0);
  }

  private native long GetIntegrator_11();
  public vtkInitialValueProblemSolver GetIntegrator()
  {
    long temp = GetIntegrator_11();

    if (temp == 0) return null;
    return (vtkInitialValueProblemSolver)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetIntegratorType_12(int id0);
  public void SetIntegratorType(int id0)
  {
    SetIntegratorType_12(id0);
  }

  private native int GetIntegratorType_13();
  public int GetIntegratorType()
  {
    return GetIntegratorType_13();
  }

  private native void SetIntegratorTypeToRungeKutta2_14();
  public void SetIntegratorTypeToRungeKutta2()
  {
    SetIntegratorTypeToRungeKutta2_14();
  }

  private native void SetIntegratorTypeToRungeKutta4_15();
  public void SetIntegratorTypeToRungeKutta4()
  {
    SetIntegratorTypeToRungeKutta4_15();
  }

  private native void SetIntegratorTypeToRungeKutta45_16();
  public void SetIntegratorTypeToRungeKutta45()
  {
    SetIntegratorTypeToRungeKutta45_16();
  }

  private native void SetInterpolatorTypeToDataSetPointLocator_17();
  public void SetInterpolatorTypeToDataSetPointLocator()
  {
    SetInterpolatorTypeToDataSetPointLocator_17();
  }

  private native void SetInterpolatorTypeToCellLocator_18();
  public void SetInterpolatorTypeToCellLocator()
  {
    SetInterpolatorTypeToCellLocator_18();
  }

  private native void SetMaximumPropagation_19(double id0);
  public void SetMaximumPropagation(double id0)
  {
    SetMaximumPropagation_19(id0);
  }

  private native double GetMaximumPropagation_20();
  public double GetMaximumPropagation()
  {
    return GetMaximumPropagation_20();
  }

  private native void SetIntegrationStepUnit_21(int id0);
  public void SetIntegrationStepUnit(int id0)
  {
    SetIntegrationStepUnit_21(id0);
  }

  private native int GetIntegrationStepUnit_22();
  public int GetIntegrationStepUnit()
  {
    return GetIntegrationStepUnit_22();
  }

  private native void SetInitialIntegrationStep_23(double id0);
  public void SetInitialIntegrationStep(double id0)
  {
    SetInitialIntegrationStep_23(id0);
  }

  private native double GetInitialIntegrationStep_24();
  public double GetInitialIntegrationStep()
  {
    return GetInitialIntegrationStep_24();
  }

  private native void SetMinimumIntegrationStep_25(double id0);
  public void SetMinimumIntegrationStep(double id0)
  {
    SetMinimumIntegrationStep_25(id0);
  }

  private native double GetMinimumIntegrationStep_26();
  public double GetMinimumIntegrationStep()
  {
    return GetMinimumIntegrationStep_26();
  }

  private native void SetMaximumIntegrationStep_27(double id0);
  public void SetMaximumIntegrationStep(double id0)
  {
    SetMaximumIntegrationStep_27(id0);
  }

  private native double GetMaximumIntegrationStep_28();
  public double GetMaximumIntegrationStep()
  {
    return GetMaximumIntegrationStep_28();
  }

  private native void SetMaximumError_29(double id0);
  public void SetMaximumError(double id0)
  {
    SetMaximumError_29(id0);
  }

  private native double GetMaximumError_30();
  public double GetMaximumError()
  {
    return GetMaximumError_30();
  }

  private native void SetMaximumNumberOfSteps_31(long id0);
  public void SetMaximumNumberOfSteps(long id0)
  {
    SetMaximumNumberOfSteps_31(id0);
  }

  private native long GetMaximumNumberOfSteps_32();
  public long GetMaximumNumberOfSteps()
  {
    return GetMaximumNumberOfSteps_32();
  }

  private native void SetTerminalSpeed_33(double id0);
  public void SetTerminalSpeed(double id0)
  {
    SetTerminalSpeed_33(id0);
  }

  private native double GetTerminalSpeed_34();
  public double GetTerminalSpeed()
  {
    return GetTerminalSpeed_34();
  }

  private native boolean GetSurfaceStreamlines_35();
  public boolean GetSurfaceStreamlines()
  {
    return GetSurfaceStreamlines_35();
  }

  private native void SetSurfaceStreamlines_36(boolean id0);
  public void SetSurfaceStreamlines(boolean id0)
  {
    SetSurfaceStreamlines_36(id0);
  }

  private native void SurfaceStreamlinesOn_37();
  public void SurfaceStreamlinesOn()
  {
    SurfaceStreamlinesOn_37();
  }

  private native void SurfaceStreamlinesOff_38();
  public void SurfaceStreamlinesOff()
  {
    SurfaceStreamlinesOff_38();
  }

  private native void SetIntegrationDirection_39(int id0);
  public void SetIntegrationDirection(int id0)
  {
    SetIntegrationDirection_39(id0);
  }

  private native int GetIntegrationDirectionMinValue_40();
  public int GetIntegrationDirectionMinValue()
  {
    return GetIntegrationDirectionMinValue_40();
  }

  private native int GetIntegrationDirectionMaxValue_41();
  public int GetIntegrationDirectionMaxValue()
  {
    return GetIntegrationDirectionMaxValue_41();
  }

  private native int GetIntegrationDirection_42();
  public int GetIntegrationDirection()
  {
    return GetIntegrationDirection_42();
  }

  private native void SetIntegrationDirectionToForward_43();
  public void SetIntegrationDirectionToForward()
  {
    SetIntegrationDirectionToForward_43();
  }

  private native void SetIntegrationDirectionToBackward_44();
  public void SetIntegrationDirectionToBackward()
  {
    SetIntegrationDirectionToBackward_44();
  }

  private native void SetIntegrationDirectionToBoth_45();
  public void SetIntegrationDirectionToBoth()
  {
    SetIntegrationDirectionToBoth_45();
  }

  private native void SetComputeVorticity_46(boolean id0);
  public void SetComputeVorticity(boolean id0)
  {
    SetComputeVorticity_46(id0);
  }

  private native boolean GetComputeVorticity_47();
  public boolean GetComputeVorticity()
  {
    return GetComputeVorticity_47();
  }

  private native void SetRotationScale_48(double id0);
  public void SetRotationScale(double id0)
  {
    SetRotationScale_48(id0);
  }

  private native double GetRotationScale_49();
  public double GetRotationScale()
  {
    return GetRotationScale_49();
  }

  private native void SetInterpolatorPrototype_50(vtkAbstractInterpolatedVelocityField id0);
  public void SetInterpolatorPrototype(vtkAbstractInterpolatedVelocityField id0)
  {
    SetInterpolatorPrototype_50(id0);
  }

  private native void SetInterpolatorType_51(int id0);
  public void SetInterpolatorType(int id0)
  {
    SetInterpolatorType_51(id0);
  }

  private native boolean GetForceSerialExecution_52();
  public boolean GetForceSerialExecution()
  {
    return GetForceSerialExecution_52();
  }

  private native void SetForceSerialExecution_53(boolean id0);
  public void SetForceSerialExecution(boolean id0)
  {
    SetForceSerialExecution_53(id0);
  }

  private native void ForceSerialExecutionOn_54();
  public void ForceSerialExecutionOn()
  {
    ForceSerialExecutionOn_54();
  }

  private native void ForceSerialExecutionOff_55();
  public void ForceSerialExecutionOff()
  {
    ForceSerialExecutionOff_55();
  }

  private native void CalculateVorticity_56(vtkGenericCell id0,double id1[],vtkDoubleArray id2,double id3[]);
  public void CalculateVorticity(vtkGenericCell id0,double id1[],vtkDoubleArray id2,double id3[])
  {
    CalculateVorticity_56(id0,id1,id2,id3);
  }

  private native void SetUseLocalSeedSource_57(boolean id0);
  public void SetUseLocalSeedSource(boolean id0)
  {
    SetUseLocalSeedSource_57(id0);
  }

  private native boolean GetUseLocalSeedSource_58();
  public boolean GetUseLocalSeedSource()
  {
    return GetUseLocalSeedSource_58();
  }

  private native void UseLocalSeedSourceOn_59();
  public void UseLocalSeedSourceOn()
  {
    UseLocalSeedSourceOn_59();
  }

  private native void UseLocalSeedSourceOff_60();
  public void UseLocalSeedSourceOff()
  {
    UseLocalSeedSourceOff_60();
  }

  public vtkStreamTracer() { super(); }

  public vtkStreamTracer(long id) { super(id); }
  public native long   VTKInit();

}
