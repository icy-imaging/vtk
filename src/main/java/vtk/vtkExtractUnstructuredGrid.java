// java wrapper for vtkExtractUnstructuredGrid object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractUnstructuredGrid extends vtkUnstructuredGridAlgorithm
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

  private native void SetPointMinimum_16(long id0);
  public void SetPointMinimum(long id0)
  {
    SetPointMinimum_16(id0);
  }

  private native long GetPointMinimumMinValue_17();
  public long GetPointMinimumMinValue()
  {
    return GetPointMinimumMinValue_17();
  }

  private native long GetPointMinimumMaxValue_18();
  public long GetPointMinimumMaxValue()
  {
    return GetPointMinimumMaxValue_18();
  }

  private native long GetPointMinimum_19();
  public long GetPointMinimum()
  {
    return GetPointMinimum_19();
  }

  private native void SetPointMaximum_20(long id0);
  public void SetPointMaximum(long id0)
  {
    SetPointMaximum_20(id0);
  }

  private native long GetPointMaximumMinValue_21();
  public long GetPointMaximumMinValue()
  {
    return GetPointMaximumMinValue_21();
  }

  private native long GetPointMaximumMaxValue_22();
  public long GetPointMaximumMaxValue()
  {
    return GetPointMaximumMaxValue_22();
  }

  private native long GetPointMaximum_23();
  public long GetPointMaximum()
  {
    return GetPointMaximum_23();
  }

  private native void SetCellMinimum_24(long id0);
  public void SetCellMinimum(long id0)
  {
    SetCellMinimum_24(id0);
  }

  private native long GetCellMinimumMinValue_25();
  public long GetCellMinimumMinValue()
  {
    return GetCellMinimumMinValue_25();
  }

  private native long GetCellMinimumMaxValue_26();
  public long GetCellMinimumMaxValue()
  {
    return GetCellMinimumMaxValue_26();
  }

  private native long GetCellMinimum_27();
  public long GetCellMinimum()
  {
    return GetCellMinimum_27();
  }

  private native void SetCellMaximum_28(long id0);
  public void SetCellMaximum(long id0)
  {
    SetCellMaximum_28(id0);
  }

  private native long GetCellMaximumMinValue_29();
  public long GetCellMaximumMinValue()
  {
    return GetCellMaximumMinValue_29();
  }

  private native long GetCellMaximumMaxValue_30();
  public long GetCellMaximumMaxValue()
  {
    return GetCellMaximumMaxValue_30();
  }

  private native long GetCellMaximum_31();
  public long GetCellMaximum()
  {
    return GetCellMaximum_31();
  }

  private native void SetExtent_32(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetExtent(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetExtent_32(id0,id1,id2,id3,id4,id5);
  }

  private native void SetExtent_33(double id0[]);
  public void SetExtent(double id0[])
  {
    SetExtent_33(id0);
  }

  private native double[] GetExtent_34();
  public double[] GetExtent()
  {
    return GetExtent_34();
  }

  private native void SetMerging_35(int id0);
  public void SetMerging(int id0)
  {
    SetMerging_35(id0);
  }

  private native int GetMerging_36();
  public int GetMerging()
  {
    return GetMerging_36();
  }

  private native void MergingOn_37();
  public void MergingOn()
  {
    MergingOn_37();
  }

  private native void MergingOff_38();
  public void MergingOff()
  {
    MergingOff_38();
  }

  private native void SetLocator_39(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_39(id0);
  }

  private native long GetLocator_40();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_40();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLocator_41();
  public void CreateDefaultLocator()
  {
    CreateDefaultLocator_41();
  }

  private native long GetMTime_42();
  public long GetMTime()
  {
    return GetMTime_42();
  }

  public vtkExtractUnstructuredGrid() { super(); }

  public vtkExtractUnstructuredGrid(long id) { super(id); }
  public native long   VTKInit();

}
