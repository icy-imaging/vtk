// java wrapper for vtkRandomPool object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRandomPool extends vtkObject
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

  private native void SetSequence_4(vtkRandomSequence id0);
  public void SetSequence(vtkRandomSequence id0)
  {
    SetSequence_4(id0);
  }

  private native long GetSequence_5();
  public vtkRandomSequence GetSequence()
  {
    long temp = GetSequence_5();

    if (temp == 0) return null;
    return (vtkRandomSequence)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSize_6(long id0);
  public void SetSize(long id0)
  {
    SetSize_6(id0);
  }

  private native long GetSizeMinValue_7();
  public long GetSizeMinValue()
  {
    return GetSizeMinValue_7();
  }

  private native long GetSizeMaxValue_8();
  public long GetSizeMaxValue()
  {
    return GetSizeMaxValue_8();
  }

  private native long GetSize_9();
  public long GetSize()
  {
    return GetSize_9();
  }

  private native void SetNumberOfComponents_10(long id0);
  public void SetNumberOfComponents(long id0)
  {
    SetNumberOfComponents_10(id0);
  }

  private native long GetNumberOfComponentsMinValue_11();
  public long GetNumberOfComponentsMinValue()
  {
    return GetNumberOfComponentsMinValue_11();
  }

  private native long GetNumberOfComponentsMaxValue_12();
  public long GetNumberOfComponentsMaxValue()
  {
    return GetNumberOfComponentsMaxValue_12();
  }

  private native long GetNumberOfComponents_13();
  public long GetNumberOfComponents()
  {
    return GetNumberOfComponents_13();
  }

  private native long GetTotalSize_14();
  public long GetTotalSize()
  {
    return GetTotalSize_14();
  }

  private native double GetValue_15(long id0);
  public double GetValue(long id0)
  {
    return GetValue_15(id0);
  }

  private native double GetValue_16(long id0,int id1);
  public double GetValue(long id0,int id1)
  {
    return GetValue_16(id0,id1);
  }

  private native void PopulateDataArray_17(vtkDataArray id0,double id1,double id2);
  public void PopulateDataArray(vtkDataArray id0,double id1,double id2)
  {
    PopulateDataArray_17(id0,id1,id2);
  }

  private native void PopulateDataArray_18(vtkDataArray id0,int id1,double id2,double id3);
  public void PopulateDataArray(vtkDataArray id0,int id1,double id2,double id3)
  {
    PopulateDataArray_18(id0,id1,id2,id3);
  }

  private native void SetChunkSize_19(long id0);
  public void SetChunkSize(long id0)
  {
    SetChunkSize_19(id0);
  }

  private native long GetChunkSizeMinValue_20();
  public long GetChunkSizeMinValue()
  {
    return GetChunkSizeMinValue_20();
  }

  private native long GetChunkSizeMaxValue_21();
  public long GetChunkSizeMaxValue()
  {
    return GetChunkSizeMaxValue_21();
  }

  private native long GetChunkSize_22();
  public long GetChunkSize()
  {
    return GetChunkSize_22();
  }

  public vtkRandomPool() { super(); }

  public vtkRandomPool(long id) { super(id); }
  public native long   VTKInit();

}
