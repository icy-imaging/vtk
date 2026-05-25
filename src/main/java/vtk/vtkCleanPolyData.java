// java wrapper for vtkCleanPolyData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCleanPolyData extends vtkPolyDataAlgorithm
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

  private native void SetToleranceIsAbsolute_4(int id0);
  public void SetToleranceIsAbsolute(int id0)
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

  private native int GetToleranceIsAbsolute_7();
  public int GetToleranceIsAbsolute()
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

  private native void SetConvertLinesToPoints_16(int id0);
  public void SetConvertLinesToPoints(int id0)
  {
    SetConvertLinesToPoints_16(id0);
  }

  private native void ConvertLinesToPointsOn_17();
  public void ConvertLinesToPointsOn()
  {
    ConvertLinesToPointsOn_17();
  }

  private native void ConvertLinesToPointsOff_18();
  public void ConvertLinesToPointsOff()
  {
    ConvertLinesToPointsOff_18();
  }

  private native int GetConvertLinesToPoints_19();
  public int GetConvertLinesToPoints()
  {
    return GetConvertLinesToPoints_19();
  }

  private native void SetConvertPolysToLines_20(int id0);
  public void SetConvertPolysToLines(int id0)
  {
    SetConvertPolysToLines_20(id0);
  }

  private native void ConvertPolysToLinesOn_21();
  public void ConvertPolysToLinesOn()
  {
    ConvertPolysToLinesOn_21();
  }

  private native void ConvertPolysToLinesOff_22();
  public void ConvertPolysToLinesOff()
  {
    ConvertPolysToLinesOff_22();
  }

  private native int GetConvertPolysToLines_23();
  public int GetConvertPolysToLines()
  {
    return GetConvertPolysToLines_23();
  }

  private native void SetConvertStripsToPolys_24(int id0);
  public void SetConvertStripsToPolys(int id0)
  {
    SetConvertStripsToPolys_24(id0);
  }

  private native void ConvertStripsToPolysOn_25();
  public void ConvertStripsToPolysOn()
  {
    ConvertStripsToPolysOn_25();
  }

  private native void ConvertStripsToPolysOff_26();
  public void ConvertStripsToPolysOff()
  {
    ConvertStripsToPolysOff_26();
  }

  private native int GetConvertStripsToPolys_27();
  public int GetConvertStripsToPolys()
  {
    return GetConvertStripsToPolys_27();
  }

  private native void SetPointMerging_28(int id0);
  public void SetPointMerging(int id0)
  {
    SetPointMerging_28(id0);
  }

  private native int GetPointMerging_29();
  public int GetPointMerging()
  {
    return GetPointMerging_29();
  }

  private native void PointMergingOn_30();
  public void PointMergingOn()
  {
    PointMergingOn_30();
  }

  private native void PointMergingOff_31();
  public void PointMergingOff()
  {
    PointMergingOff_31();
  }

  private native void SetLocator_32(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_32(id0);
  }

  private native long GetLocator_33();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_33();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLocator_34(vtkPolyData id0);
  public void CreateDefaultLocator(vtkPolyData id0)
  {
    CreateDefaultLocator_34(id0);
  }

  private native void ReleaseLocator_35();
  public void ReleaseLocator()
  {
    ReleaseLocator_35();
  }

  private native long GetMTime_36();
  public long GetMTime()
  {
    return GetMTime_36();
  }

  private native void OperateOnPoint_37(double id0[],double id1[]);
  public void OperateOnPoint(double id0[],double id1[])
  {
    OperateOnPoint_37(id0,id1);
  }

  private native void OperateOnBounds_38(double id0[],double id1[]);
  public void OperateOnBounds(double id0[],double id1[])
  {
    OperateOnBounds_38(id0,id1);
  }

  private native void SetPieceInvariant_39(int id0);
  public void SetPieceInvariant(int id0)
  {
    SetPieceInvariant_39(id0);
  }

  private native int GetPieceInvariant_40();
  public int GetPieceInvariant()
  {
    return GetPieceInvariant_40();
  }

  private native void PieceInvariantOn_41();
  public void PieceInvariantOn()
  {
    PieceInvariantOn_41();
  }

  private native void PieceInvariantOff_42();
  public void PieceInvariantOff()
  {
    PieceInvariantOff_42();
  }

  private native void SetOutputPointsPrecision_43(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_43(id0);
  }

  private native int GetOutputPointsPrecision_44();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_44();
  }

  public vtkCleanPolyData() { super(); }

  public vtkCleanPolyData(long id) { super(id); }
  public native long   VTKInit();

}
