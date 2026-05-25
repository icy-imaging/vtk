// java wrapper for vtkEvenlySpacedStreamlines2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkEvenlySpacedStreamlines2D extends vtkPolyDataAlgorithm
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

  private native void SetIntegrator_7(vtkInitialValueProblemSolver id0);
  public void SetIntegrator(vtkInitialValueProblemSolver id0)
  {
    SetIntegrator_7(id0);
  }

  private native long GetIntegrator_8();
  public vtkInitialValueProblemSolver GetIntegrator()
  {
    long temp = GetIntegrator_8();

    if (temp == 0) return null;
    return (vtkInitialValueProblemSolver)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetIntegratorType_9(int id0);
  public void SetIntegratorType(int id0)
  {
    SetIntegratorType_9(id0);
  }

  private native int GetIntegratorType_10();
  public int GetIntegratorType()
  {
    return GetIntegratorType_10();
  }

  private native void SetIntegratorTypeToRungeKutta2_11();
  public void SetIntegratorTypeToRungeKutta2()
  {
    SetIntegratorTypeToRungeKutta2_11();
  }

  private native void SetIntegratorTypeToRungeKutta4_12();
  public void SetIntegratorTypeToRungeKutta4()
  {
    SetIntegratorTypeToRungeKutta4_12();
  }

  private native void SetInterpolatorTypeToDataSetPointLocator_13();
  public void SetInterpolatorTypeToDataSetPointLocator()
  {
    SetInterpolatorTypeToDataSetPointLocator_13();
  }

  private native void SetInterpolatorTypeToCellLocator_14();
  public void SetInterpolatorTypeToCellLocator()
  {
    SetInterpolatorTypeToCellLocator_14();
  }

  private native void SetIntegrationStepUnit_15(int id0);
  public void SetIntegrationStepUnit(int id0)
  {
    SetIntegrationStepUnit_15(id0);
  }

  private native int GetIntegrationStepUnit_16();
  public int GetIntegrationStepUnit()
  {
    return GetIntegrationStepUnit_16();
  }

  private native void SetMaximumNumberOfSteps_17(long id0);
  public void SetMaximumNumberOfSteps(long id0)
  {
    SetMaximumNumberOfSteps_17(id0);
  }

  private native long GetMaximumNumberOfSteps_18();
  public long GetMaximumNumberOfSteps()
  {
    return GetMaximumNumberOfSteps_18();
  }

  private native void SetMinimumNumberOfLoopPoints_19(long id0);
  public void SetMinimumNumberOfLoopPoints(long id0)
  {
    SetMinimumNumberOfLoopPoints_19(id0);
  }

  private native long GetMinimumNumberOfLoopPoints_20();
  public long GetMinimumNumberOfLoopPoints()
  {
    return GetMinimumNumberOfLoopPoints_20();
  }

  private native void SetInitialIntegrationStep_21(double id0);
  public void SetInitialIntegrationStep(double id0)
  {
    SetInitialIntegrationStep_21(id0);
  }

  private native double GetInitialIntegrationStep_22();
  public double GetInitialIntegrationStep()
  {
    return GetInitialIntegrationStep_22();
  }

  private native void SetSeparatingDistance_23(double id0);
  public void SetSeparatingDistance(double id0)
  {
    SetSeparatingDistance_23(id0);
  }

  private native double GetSeparatingDistance_24();
  public double GetSeparatingDistance()
  {
    return GetSeparatingDistance_24();
  }

  private native void SetSeparatingDistanceRatio_25(double id0);
  public void SetSeparatingDistanceRatio(double id0)
  {
    SetSeparatingDistanceRatio_25(id0);
  }

  private native double GetSeparatingDistanceRatio_26();
  public double GetSeparatingDistanceRatio()
  {
    return GetSeparatingDistanceRatio_26();
  }

  private native void SetClosedLoopMaximumDistance_27(double id0);
  public void SetClosedLoopMaximumDistance(double id0)
  {
    SetClosedLoopMaximumDistance_27(id0);
  }

  private native double GetClosedLoopMaximumDistance_28();
  public double GetClosedLoopMaximumDistance()
  {
    return GetClosedLoopMaximumDistance_28();
  }

  private native void SetLoopAngle_29(double id0);
  public void SetLoopAngle(double id0)
  {
    SetLoopAngle_29(id0);
  }

  private native double GetLoopAngle_30();
  public double GetLoopAngle()
  {
    return GetLoopAngle_30();
  }

  private native void SetTerminalSpeed_31(double id0);
  public void SetTerminalSpeed(double id0)
  {
    SetTerminalSpeed_31(id0);
  }

  private native double GetTerminalSpeed_32();
  public double GetTerminalSpeed()
  {
    return GetTerminalSpeed_32();
  }

  private native void SetComputeVorticity_33(boolean id0);
  public void SetComputeVorticity(boolean id0)
  {
    SetComputeVorticity_33(id0);
  }

  private native boolean GetComputeVorticity_34();
  public boolean GetComputeVorticity()
  {
    return GetComputeVorticity_34();
  }

  private native void SetInterpolatorPrototype_35(vtkAbstractInterpolatedVelocityField id0);
  public void SetInterpolatorPrototype(vtkAbstractInterpolatedVelocityField id0)
  {
    SetInterpolatorPrototype_35(id0);
  }

  private native void SetInterpolatorType_36(int id0);
  public void SetInterpolatorType(int id0)
  {
    SetInterpolatorType_36(id0);
  }

  public vtkEvenlySpacedStreamlines2D() { super(); }

  public vtkEvenlySpacedStreamlines2D(long id) { super(id); }
  public native long   VTKInit();

}
