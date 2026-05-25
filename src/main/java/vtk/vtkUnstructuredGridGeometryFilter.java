// java wrapper for vtkUnstructuredGridGeometryFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkUnstructuredGridGeometryFilter extends vtkUnstructuredGridBaseAlgorithm
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

  private native void SetPointClipping_4(int id0);
  public void SetPointClipping(int id0)
  {
    SetPointClipping_4(id0);
  }

  private native int GetPointClipping_5();
  public int GetPointClipping()
  {
    return GetPointClipping_5();
  }

  private native void PointClippingOn_6();
  public void PointClippingOn()
  {
    PointClippingOn_6();
  }

  private native void PointClippingOff_7();
  public void PointClippingOff()
  {
    PointClippingOff_7();
  }

  private native void SetCellClipping_8(int id0);
  public void SetCellClipping(int id0)
  {
    SetCellClipping_8(id0);
  }

  private native int GetCellClipping_9();
  public int GetCellClipping()
  {
    return GetCellClipping_9();
  }

  private native void CellClippingOn_10();
  public void CellClippingOn()
  {
    CellClippingOn_10();
  }

  private native void CellClippingOff_11();
  public void CellClippingOff()
  {
    CellClippingOff_11();
  }

  private native void SetExtentClipping_12(int id0);
  public void SetExtentClipping(int id0)
  {
    SetExtentClipping_12(id0);
  }

  private native int GetExtentClipping_13();
  public int GetExtentClipping()
  {
    return GetExtentClipping_13();
  }

  private native void ExtentClippingOn_14();
  public void ExtentClippingOn()
  {
    ExtentClippingOn_14();
  }

  private native void ExtentClippingOff_15();
  public void ExtentClippingOff()
  {
    ExtentClippingOff_15();
  }

  private native void SetDuplicateGhostCellClipping_16(int id0);
  public void SetDuplicateGhostCellClipping(int id0)
  {
    SetDuplicateGhostCellClipping_16(id0);
  }

  private native int GetDuplicateGhostCellClipping_17();
  public int GetDuplicateGhostCellClipping()
  {
    return GetDuplicateGhostCellClipping_17();
  }

  private native void DuplicateGhostCellClippingOn_18();
  public void DuplicateGhostCellClippingOn()
  {
    DuplicateGhostCellClippingOn_18();
  }

  private native void DuplicateGhostCellClippingOff_19();
  public void DuplicateGhostCellClippingOff()
  {
    DuplicateGhostCellClippingOff_19();
  }

  private native void SetPointMinimum_20(long id0);
  public void SetPointMinimum(long id0)
  {
    SetPointMinimum_20(id0);
  }

  private native long GetPointMinimumMinValue_21();
  public long GetPointMinimumMinValue()
  {
    return GetPointMinimumMinValue_21();
  }

  private native long GetPointMinimumMaxValue_22();
  public long GetPointMinimumMaxValue()
  {
    return GetPointMinimumMaxValue_22();
  }

  private native long GetPointMinimum_23();
  public long GetPointMinimum()
  {
    return GetPointMinimum_23();
  }

  private native void SetPointMaximum_24(long id0);
  public void SetPointMaximum(long id0)
  {
    SetPointMaximum_24(id0);
  }

  private native long GetPointMaximumMinValue_25();
  public long GetPointMaximumMinValue()
  {
    return GetPointMaximumMinValue_25();
  }

  private native long GetPointMaximumMaxValue_26();
  public long GetPointMaximumMaxValue()
  {
    return GetPointMaximumMaxValue_26();
  }

  private native long GetPointMaximum_27();
  public long GetPointMaximum()
  {
    return GetPointMaximum_27();
  }

  private native void SetCellMinimum_28(long id0);
  public void SetCellMinimum(long id0)
  {
    SetCellMinimum_28(id0);
  }

  private native long GetCellMinimumMinValue_29();
  public long GetCellMinimumMinValue()
  {
    return GetCellMinimumMinValue_29();
  }

  private native long GetCellMinimumMaxValue_30();
  public long GetCellMinimumMaxValue()
  {
    return GetCellMinimumMaxValue_30();
  }

  private native long GetCellMinimum_31();
  public long GetCellMinimum()
  {
    return GetCellMinimum_31();
  }

  private native void SetCellMaximum_32(long id0);
  public void SetCellMaximum(long id0)
  {
    SetCellMaximum_32(id0);
  }

  private native long GetCellMaximumMinValue_33();
  public long GetCellMaximumMinValue()
  {
    return GetCellMaximumMinValue_33();
  }

  private native long GetCellMaximumMaxValue_34();
  public long GetCellMaximumMaxValue()
  {
    return GetCellMaximumMaxValue_34();
  }

  private native long GetCellMaximum_35();
  public long GetCellMaximum()
  {
    return GetCellMaximum_35();
  }

  private native void SetExtent_36(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetExtent(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetExtent_36(id0,id1,id2,id3,id4,id5);
  }

  private native void SetExtent_37(double id0[]);
  public void SetExtent(double id0[])
  {
    SetExtent_37(id0);
  }

  private native void SetMerging_38(int id0);
  public void SetMerging(int id0)
  {
    SetMerging_38(id0);
  }

  private native int GetMerging_39();
  public int GetMerging()
  {
    return GetMerging_39();
  }

  private native void MergingOn_40();
  public void MergingOn()
  {
    MergingOn_40();
  }

  private native void MergingOff_41();
  public void MergingOff()
  {
    MergingOff_41();
  }

  private native void SetPassThroughCellIds_42(int id0);
  public void SetPassThroughCellIds(int id0)
  {
    SetPassThroughCellIds_42(id0);
  }

  private native int GetPassThroughCellIds_43();
  public int GetPassThroughCellIds()
  {
    return GetPassThroughCellIds_43();
  }

  private native void PassThroughCellIdsOn_44();
  public void PassThroughCellIdsOn()
  {
    PassThroughCellIdsOn_44();
  }

  private native void PassThroughCellIdsOff_45();
  public void PassThroughCellIdsOff()
  {
    PassThroughCellIdsOff_45();
  }

  private native void SetPassThroughPointIds_46(int id0);
  public void SetPassThroughPointIds(int id0)
  {
    SetPassThroughPointIds_46(id0);
  }

  private native int GetPassThroughPointIds_47();
  public int GetPassThroughPointIds()
  {
    return GetPassThroughPointIds_47();
  }

  private native void PassThroughPointIdsOn_48();
  public void PassThroughPointIdsOn()
  {
    PassThroughPointIdsOn_48();
  }

  private native void PassThroughPointIdsOff_49();
  public void PassThroughPointIdsOff()
  {
    PassThroughPointIdsOff_49();
  }

  private native void SetMatchBoundariesIgnoringCellOrder_50(int id0);
  public void SetMatchBoundariesIgnoringCellOrder(int id0)
  {
    SetMatchBoundariesIgnoringCellOrder_50(id0);
  }

  private native int GetMatchBoundariesIgnoringCellOrder_51();
  public int GetMatchBoundariesIgnoringCellOrder()
  {
    return GetMatchBoundariesIgnoringCellOrder_51();
  }

  private native void SetOriginalCellIdsName_52(byte[] id0, int len0);
  public void SetOriginalCellIdsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOriginalCellIdsName_52(bytes0, bytes0.length);
  }

  private native byte[] GetOriginalCellIdsName_53();
  public String GetOriginalCellIdsName()
  {
    return new String(GetOriginalCellIdsName_53(), StandardCharsets.UTF_8);
  }

  private native void SetOriginalPointIdsName_54(byte[] id0, int len0);
  public void SetOriginalPointIdsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOriginalPointIdsName_54(bytes0, bytes0.length);
  }

  private native byte[] GetOriginalPointIdsName_55();
  public String GetOriginalPointIdsName()
  {
    return new String(GetOriginalPointIdsName_55(), StandardCharsets.UTF_8);
  }

  private native void SetLocator_56(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_56(id0);
  }

  private native long GetLocator_57();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_57();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLocator_58();
  public void CreateDefaultLocator()
  {
    CreateDefaultLocator_58();
  }

  private native long GetMTime_59();
  public long GetMTime()
  {
    return GetMTime_59();
  }

  public vtkUnstructuredGridGeometryFilter() { super(); }

  public vtkUnstructuredGridGeometryFilter(long id) { super(id); }
  public native long   VTKInit();

}
