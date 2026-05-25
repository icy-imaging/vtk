// java wrapper for vtkArray object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkArray extends vtkObject
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

  private native long CreateArray_4(int id0,int id1);
  public vtkArray CreateArray(int id0,int id1)
  {
    long temp = CreateArray_4(id0,id1);

    if (temp == 0) return null;
    return (vtkArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean IsDense_5();
  public boolean IsDense()
  {
    return IsDense_5();
  }

  private native void Resize_6(long id0);
  public void Resize(long id0)
  {
    Resize_6(id0);
  }

  private native void Resize_7(long id0,long id1);
  public void Resize(long id0,long id1)
  {
    Resize_7(id0,id1);
  }

  private native void Resize_8(long id0,long id1,long id2);
  public void Resize(long id0,long id1,long id2)
  {
    Resize_8(id0,id1,id2);
  }

  private native long GetDimensions_9();
  public long GetDimensions()
  {
    return GetDimensions_9();
  }

  private native long GetSize_10();
  public long GetSize()
  {
    return GetSize_10();
  }

  private native long GetNonNullSize_11();
  public long GetNonNullSize()
  {
    return GetNonNullSize_11();
  }

  private native void SetName_12(byte[] id0, int len0);
  public void SetName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetName_12(bytes0, bytes0.length);
  }

  private native byte[] GetName_13();
  public String GetName()
  {
    return new String(GetName_13(), StandardCharsets.UTF_8);
  }

  private native void SetDimensionLabel_14(long id0,byte[] id1, int len1);
  public void SetDimensionLabel(long id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetDimensionLabel_14(id0,bytes1, bytes1.length);
  }

  private native byte[] GetDimensionLabel_15(long id0);
  public String GetDimensionLabel(long id0)
  {
    return new String(GetDimensionLabel_15(id0), StandardCharsets.UTF_8);
  }

  private native long DeepCopy_16();
  public vtkArray DeepCopy()
  {
    long temp = DeepCopy_16();

    if (temp == 0) return null;
    return (vtkArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkArray() { super(); }

  public vtkArray(long id) { super(id); }

}
