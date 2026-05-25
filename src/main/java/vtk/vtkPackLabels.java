// java wrapper for vtkPackLabels object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPackLabels extends vtkDataSetAlgorithm
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

  private native long GetLabels_4();
  public vtkDataArray GetLabels()
  {
    long temp = GetLabels_4();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNumberOfLabels_5();
  public long GetNumberOfLabels()
  {
    return GetNumberOfLabels_5();
  }

  private native long GetLabelsCount_6();
  public vtkIdTypeArray GetLabelsCount()
  {
    long temp = GetLabelsCount_6();

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSortBy_7(int id0);
  public void SetSortBy(int id0)
  {
    SetSortBy_7(id0);
  }

  private native int GetSortByMinValue_8();
  public int GetSortByMinValue()
  {
    return GetSortByMinValue_8();
  }

  private native int GetSortByMaxValue_9();
  public int GetSortByMaxValue()
  {
    return GetSortByMaxValue_9();
  }

  private native int GetSortBy_10();
  public int GetSortBy()
  {
    return GetSortBy_10();
  }

  private native void SortByLabelValue_11();
  public void SortByLabelValue()
  {
    SortByLabelValue_11();
  }

  private native void SortByLabelCount_12();
  public void SortByLabelCount()
  {
    SortByLabelCount_12();
  }

  private native void SetOutputScalarType_13(int id0);
  public void SetOutputScalarType(int id0)
  {
    SetOutputScalarType_13(id0);
  }

  private native int GetOutputScalarType_14();
  public int GetOutputScalarType()
  {
    return GetOutputScalarType_14();
  }

  private native void SetOutputScalarTypeToDefault_15();
  public void SetOutputScalarTypeToDefault()
  {
    SetOutputScalarTypeToDefault_15();
  }

  private native void SetOutputScalarTypeToUnsignedChar_16();
  public void SetOutputScalarTypeToUnsignedChar()
  {
    SetOutputScalarTypeToUnsignedChar_16();
  }

  private native void SetOutputScalarTypeToUnsignedShort_17();
  public void SetOutputScalarTypeToUnsignedShort()
  {
    SetOutputScalarTypeToUnsignedShort_17();
  }

  private native void SetOutputScalarTypeToUnsignedInt_18();
  public void SetOutputScalarTypeToUnsignedInt()
  {
    SetOutputScalarTypeToUnsignedInt_18();
  }

  private native void SetOutputScalarTypeToUnsignedLong_19();
  public void SetOutputScalarTypeToUnsignedLong()
  {
    SetOutputScalarTypeToUnsignedLong_19();
  }

  private native void SetBackgroundValue_20(long id0);
  public void SetBackgroundValue(long id0)
  {
    SetBackgroundValue_20(id0);
  }

  private native long GetBackgroundValue_21();
  public long GetBackgroundValue()
  {
    return GetBackgroundValue_21();
  }

  private native void SetPassPointData_22(boolean id0);
  public void SetPassPointData(boolean id0)
  {
    SetPassPointData_22(id0);
  }

  private native boolean GetPassPointData_23();
  public boolean GetPassPointData()
  {
    return GetPassPointData_23();
  }

  private native void PassPointDataOn_24();
  public void PassPointDataOn()
  {
    PassPointDataOn_24();
  }

  private native void PassPointDataOff_25();
  public void PassPointDataOff()
  {
    PassPointDataOff_25();
  }

  private native void SetPassCellData_26(boolean id0);
  public void SetPassCellData(boolean id0)
  {
    SetPassCellData_26(id0);
  }

  private native boolean GetPassCellData_27();
  public boolean GetPassCellData()
  {
    return GetPassCellData_27();
  }

  private native void PassCellDataOn_28();
  public void PassCellDataOn()
  {
    PassCellDataOn_28();
  }

  private native void PassCellDataOff_29();
  public void PassCellDataOff()
  {
    PassCellDataOff_29();
  }

  private native void SetPassFieldData_30(boolean id0);
  public void SetPassFieldData(boolean id0)
  {
    SetPassFieldData_30(id0);
  }

  private native boolean GetPassFieldData_31();
  public boolean GetPassFieldData()
  {
    return GetPassFieldData_31();
  }

  private native void PassFieldDataOn_32();
  public void PassFieldDataOn()
  {
    PassFieldDataOn_32();
  }

  private native void PassFieldDataOff_33();
  public void PassFieldDataOff()
  {
    PassFieldDataOff_33();
  }

  public vtkPackLabels() { super(); }

  public vtkPackLabels(long id) { super(id); }
  public native long   VTKInit();

}
