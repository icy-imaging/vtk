// java wrapper for vtkVectorFieldTopology object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVectorFieldTopology extends vtkPolyDataAlgorithm
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

  private native void SetIntegrationStepUnit_4(int id0);
  public void SetIntegrationStepUnit(int id0)
  {
    SetIntegrationStepUnit_4(id0);
  }

  private native int GetIntegrationStepUnit_5();
  public int GetIntegrationStepUnit()
  {
    return GetIntegrationStepUnit_5();
  }

  private native void SetMaxNumSteps_6(int id0);
  public void SetMaxNumSteps(int id0)
  {
    SetMaxNumSteps_6(id0);
  }

  private native int GetMaxNumSteps_7();
  public int GetMaxNumSteps()
  {
    return GetMaxNumSteps_7();
  }

  private native void SetIntegrationStepSize_8(double id0);
  public void SetIntegrationStepSize(double id0)
  {
    SetIntegrationStepSize_8(id0);
  }

  private native double GetIntegrationStepSize_9();
  public double GetIntegrationStepSize()
  {
    return GetIntegrationStepSize_9();
  }

  private native void SetSeparatrixDistance_10(double id0);
  public void SetSeparatrixDistance(double id0)
  {
    SetSeparatrixDistance_10(id0);
  }

  private native double GetSeparatrixDistance_11();
  public double GetSeparatrixDistance()
  {
    return GetSeparatrixDistance_11();
  }

  private native void SetUseIterativeSeeding_12(boolean id0);
  public void SetUseIterativeSeeding(boolean id0)
  {
    SetUseIterativeSeeding_12(id0);
  }

  private native boolean GetUseIterativeSeeding_13();
  public boolean GetUseIterativeSeeding()
  {
    return GetUseIterativeSeeding_13();
  }

  private native void SetComputeSurfaces_14(boolean id0);
  public void SetComputeSurfaces(boolean id0)
  {
    SetComputeSurfaces_14(id0);
  }

  private native boolean GetComputeSurfaces_15();
  public boolean GetComputeSurfaces()
  {
    return GetComputeSurfaces_15();
  }

  private native void SetExcludeBoundary_16(boolean id0);
  public void SetExcludeBoundary(boolean id0)
  {
    SetExcludeBoundary_16(id0);
  }

  private native boolean GetExcludeBoundary_17();
  public boolean GetExcludeBoundary()
  {
    return GetExcludeBoundary_17();
  }

  private native void SetUseBoundarySwitchPoints_18(boolean id0);
  public void SetUseBoundarySwitchPoints(boolean id0)
  {
    SetUseBoundarySwitchPoints_18(id0);
  }

  private native boolean GetUseBoundarySwitchPoints_19();
  public boolean GetUseBoundarySwitchPoints()
  {
    return GetUseBoundarySwitchPoints_19();
  }

  private native void SetVectorAngleThreshold_20(double id0);
  public void SetVectorAngleThreshold(double id0)
  {
    SetVectorAngleThreshold_20(id0);
  }

  private native double GetVectorAngleThreshold_21();
  public double GetVectorAngleThreshold()
  {
    return GetVectorAngleThreshold_21();
  }

  private native void SetOffsetAwayFromBoundary_22(double id0);
  public void SetOffsetAwayFromBoundary(double id0)
  {
    SetOffsetAwayFromBoundary_22(id0);
  }

  private native double GetOffsetAwayFromBoundary_23();
  public double GetOffsetAwayFromBoundary()
  {
    return GetOffsetAwayFromBoundary_23();
  }

  private native void SetEpsilonCriticalPoint_24(double id0);
  public void SetEpsilonCriticalPoint(double id0)
  {
    SetEpsilonCriticalPoint_24(id0);
  }

  private native double GetEpsilonCriticalPoint_25();
  public double GetEpsilonCriticalPoint()
  {
    return GetEpsilonCriticalPoint_25();
  }

  private native void SetInterpolatorType_26(int id0);
  public void SetInterpolatorType(int id0)
  {
    SetInterpolatorType_26(id0);
  }

  private native void SetInterpolatorTypeToCellLocator_27();
  public void SetInterpolatorTypeToCellLocator()
  {
    SetInterpolatorTypeToCellLocator_27();
  }

  private native void SetInterpolatorTypeToDataSetPointLocator_28();
  public void SetInterpolatorTypeToDataSetPointLocator()
  {
    SetInterpolatorTypeToDataSetPointLocator_28();
  }

  public vtkVectorFieldTopology() { super(); }

  public vtkVectorFieldTopology(long id) { super(id); }
  public native long   VTKInit();

}
