// java wrapper for vtkStaticCleanUnstructuredGrid object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStaticCleanUnstructuredGrid extends vtkUnstructuredGridAlgorithm
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

  private native void SetToleranceIsAbsolute_4(boolean id0);
  public void SetToleranceIsAbsolute(boolean id0)
  {
    SetToleranceIsAbsolute_4(id0);
  }

  private native void ToleranceIsAbsoluteOn_5();
  public void ToleranceIsAbsoluteOn()
  {
    ToleranceIsAbsoluteOn_5();
  }

  private native void ToleranceIsAbsoluteOff_6();
  public void ToleranceIsAbsoluteOff()
  {
    ToleranceIsAbsoluteOff_6();
  }

  private native boolean GetToleranceIsAbsolute_7();
  public boolean GetToleranceIsAbsolute()
  {
    return GetToleranceIsAbsolute_7();
  }

  private native void SetAbsoluteTolerance_8(double id0);
  public void SetAbsoluteTolerance(double id0)
  {
    SetAbsoluteTolerance_8(id0);
  }

  private native double GetAbsoluteToleranceMinValue_9();
  public double GetAbsoluteToleranceMinValue()
  {
    return GetAbsoluteToleranceMinValue_9();
  }

  private native double GetAbsoluteToleranceMaxValue_10();
  public double GetAbsoluteToleranceMaxValue()
  {
    return GetAbsoluteToleranceMaxValue_10();
  }

  private native double GetAbsoluteTolerance_11();
  public double GetAbsoluteTolerance()
  {
    return GetAbsoluteTolerance_11();
  }

  private native void SetTolerance_12(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_12(id0);
  }

  private native double GetToleranceMinValue_13();
  public double GetToleranceMinValue()
  {
    return GetToleranceMinValue_13();
  }

  private native double GetToleranceMaxValue_14();
  public double GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_14();
  }

  private native double GetTolerance_15();
  public double GetTolerance()
  {
    return GetTolerance_15();
  }

  private native void SetMergingArray_16(byte[] id0, int len0);
  public void SetMergingArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetMergingArray_16(bytes0, bytes0.length);
  }

  private native byte[] GetMergingArray_17();
  public String GetMergingArray()
  {
    return new String(GetMergingArray_17(), StandardCharsets.UTF_8);
  }

  private native void SetRemoveUnusedPoints_18(boolean id0);
  public void SetRemoveUnusedPoints(boolean id0)
  {
    SetRemoveUnusedPoints_18(id0);
  }

  private native void RemoveUnusedPointsOn_19();
  public void RemoveUnusedPointsOn()
  {
    RemoveUnusedPointsOn_19();
  }

  private native void RemoveUnusedPointsOff_20();
  public void RemoveUnusedPointsOff()
  {
    RemoveUnusedPointsOff_20();
  }

  private native boolean GetRemoveUnusedPoints_21();
  public boolean GetRemoveUnusedPoints()
  {
    return GetRemoveUnusedPoints_21();
  }

  private native void SetProduceMergeMap_22(boolean id0);
  public void SetProduceMergeMap(boolean id0)
  {
    SetProduceMergeMap_22(id0);
  }

  private native void ProduceMergeMapOn_23();
  public void ProduceMergeMapOn()
  {
    ProduceMergeMapOn_23();
  }

  private native void ProduceMergeMapOff_24();
  public void ProduceMergeMapOff()
  {
    ProduceMergeMapOff_24();
  }

  private native boolean GetProduceMergeMap_25();
  public boolean GetProduceMergeMap()
  {
    return GetProduceMergeMap_25();
  }

  private native void SetAveragePointData_26(boolean id0);
  public void SetAveragePointData(boolean id0)
  {
    SetAveragePointData_26(id0);
  }

  private native void AveragePointDataOn_27();
  public void AveragePointDataOn()
  {
    AveragePointDataOn_27();
  }

  private native void AveragePointDataOff_28();
  public void AveragePointDataOff()
  {
    AveragePointDataOff_28();
  }

  private native boolean GetAveragePointData_29();
  public boolean GetAveragePointData()
  {
    return GetAveragePointData_29();
  }

  private native void SetOutputPointsPrecision_30(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_30(id0);
  }

  private native int GetOutputPointsPrecision_31();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_31();
  }

  private native long GetLocator_32();
  public vtkStaticPointLocator GetLocator()
  {
    long temp = GetLocator_32();

    if (temp == 0) return null;
    return (vtkStaticPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPieceInvariant_33(boolean id0);
  public void SetPieceInvariant(boolean id0)
  {
    SetPieceInvariant_33(id0);
  }

  private native boolean GetPieceInvariant_34();
  public boolean GetPieceInvariant()
  {
    return GetPieceInvariant_34();
  }

  private native void PieceInvariantOn_35();
  public void PieceInvariantOn()
  {
    PieceInvariantOn_35();
  }

  private native void PieceInvariantOff_36();
  public void PieceInvariantOff()
  {
    PieceInvariantOff_36();
  }

  private native long GetMTime_37();
  public long GetMTime()
  {
    return GetMTime_37();
  }

  public vtkStaticCleanUnstructuredGrid() { super(); }

  public vtkStaticCleanUnstructuredGrid(long id) { super(id); }
  public native long   VTKInit();

}
