// java wrapper for vtkStaticCleanPolyData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStaticCleanPolyData extends vtkPolyDataAlgorithm
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

  private native void SetTolerance_8(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_8(id0);
  }

  private native double GetToleranceMinValue_9();
  public double GetToleranceMinValue()
  {
    return GetToleranceMinValue_9();
  }

  private native double GetToleranceMaxValue_10();
  public double GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_10();
  }

  private native double GetTolerance_11();
  public double GetTolerance()
  {
    return GetTolerance_11();
  }

  private native void SetAbsoluteTolerance_12(double id0);
  public void SetAbsoluteTolerance(double id0)
  {
    SetAbsoluteTolerance_12(id0);
  }

  private native double GetAbsoluteToleranceMinValue_13();
  public double GetAbsoluteToleranceMinValue()
  {
    return GetAbsoluteToleranceMinValue_13();
  }

  private native double GetAbsoluteToleranceMaxValue_14();
  public double GetAbsoluteToleranceMaxValue()
  {
    return GetAbsoluteToleranceMaxValue_14();
  }

  private native double GetAbsoluteTolerance_15();
  public double GetAbsoluteTolerance()
  {
    return GetAbsoluteTolerance_15();
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

  private native void SetConvertLinesToPoints_18(boolean id0);
  public void SetConvertLinesToPoints(boolean id0)
  {
    SetConvertLinesToPoints_18(id0);
  }

  private native void ConvertLinesToPointsOn_19();
  public void ConvertLinesToPointsOn()
  {
    ConvertLinesToPointsOn_19();
  }

  private native void ConvertLinesToPointsOff_20();
  public void ConvertLinesToPointsOff()
  {
    ConvertLinesToPointsOff_20();
  }

  private native boolean GetConvertLinesToPoints_21();
  public boolean GetConvertLinesToPoints()
  {
    return GetConvertLinesToPoints_21();
  }

  private native void SetConvertPolysToLines_22(boolean id0);
  public void SetConvertPolysToLines(boolean id0)
  {
    SetConvertPolysToLines_22(id0);
  }

  private native void ConvertPolysToLinesOn_23();
  public void ConvertPolysToLinesOn()
  {
    ConvertPolysToLinesOn_23();
  }

  private native void ConvertPolysToLinesOff_24();
  public void ConvertPolysToLinesOff()
  {
    ConvertPolysToLinesOff_24();
  }

  private native boolean GetConvertPolysToLines_25();
  public boolean GetConvertPolysToLines()
  {
    return GetConvertPolysToLines_25();
  }

  private native void SetConvertStripsToPolys_26(boolean id0);
  public void SetConvertStripsToPolys(boolean id0)
  {
    SetConvertStripsToPolys_26(id0);
  }

  private native void ConvertStripsToPolysOn_27();
  public void ConvertStripsToPolysOn()
  {
    ConvertStripsToPolysOn_27();
  }

  private native void ConvertStripsToPolysOff_28();
  public void ConvertStripsToPolysOff()
  {
    ConvertStripsToPolysOff_28();
  }

  private native boolean GetConvertStripsToPolys_29();
  public boolean GetConvertStripsToPolys()
  {
    return GetConvertStripsToPolys_29();
  }

  private native void SetRemoveUnusedPoints_30(boolean id0);
  public void SetRemoveUnusedPoints(boolean id0)
  {
    SetRemoveUnusedPoints_30(id0);
  }

  private native void RemoveUnusedPointsOn_31();
  public void RemoveUnusedPointsOn()
  {
    RemoveUnusedPointsOn_31();
  }

  private native void RemoveUnusedPointsOff_32();
  public void RemoveUnusedPointsOff()
  {
    RemoveUnusedPointsOff_32();
  }

  private native boolean GetRemoveUnusedPoints_33();
  public boolean GetRemoveUnusedPoints()
  {
    return GetRemoveUnusedPoints_33();
  }

  private native void SetProduceMergeMap_34(boolean id0);
  public void SetProduceMergeMap(boolean id0)
  {
    SetProduceMergeMap_34(id0);
  }

  private native void ProduceMergeMapOn_35();
  public void ProduceMergeMapOn()
  {
    ProduceMergeMapOn_35();
  }

  private native void ProduceMergeMapOff_36();
  public void ProduceMergeMapOff()
  {
    ProduceMergeMapOff_36();
  }

  private native boolean GetProduceMergeMap_37();
  public boolean GetProduceMergeMap()
  {
    return GetProduceMergeMap_37();
  }

  private native void SetAveragePointData_38(boolean id0);
  public void SetAveragePointData(boolean id0)
  {
    SetAveragePointData_38(id0);
  }

  private native void AveragePointDataOn_39();
  public void AveragePointDataOn()
  {
    AveragePointDataOn_39();
  }

  private native void AveragePointDataOff_40();
  public void AveragePointDataOff()
  {
    AveragePointDataOff_40();
  }

  private native boolean GetAveragePointData_41();
  public boolean GetAveragePointData()
  {
    return GetAveragePointData_41();
  }

  private native void SetOutputPointsPrecision_42(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_42(id0);
  }

  private native int GetOutputPointsPrecision_43();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_43();
  }

  private native long GetLocator_44();
  public vtkStaticPointLocator GetLocator()
  {
    long temp = GetLocator_44();

    if (temp == 0) return null;
    return (vtkStaticPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPieceInvariant_45(boolean id0);
  public void SetPieceInvariant(boolean id0)
  {
    SetPieceInvariant_45(id0);
  }

  private native boolean GetPieceInvariant_46();
  public boolean GetPieceInvariant()
  {
    return GetPieceInvariant_46();
  }

  private native void PieceInvariantOn_47();
  public void PieceInvariantOn()
  {
    PieceInvariantOn_47();
  }

  private native void PieceInvariantOff_48();
  public void PieceInvariantOff()
  {
    PieceInvariantOff_48();
  }

  private native long GetMTime_49();
  public long GetMTime()
  {
    return GetMTime_49();
  }

  public vtkStaticCleanPolyData() { super(); }

  public vtkStaticCleanPolyData(long id) { super(id); }
  public native long   VTKInit();

}
