// java wrapper for vtkInformationObjectBaseVectorKey object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInformationObjectBaseVectorKey extends vtkInformationKey
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

  private native long MakeKey_4(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2);
  public vtkInformationObjectBaseVectorKey MakeKey(String id0,String id1,String id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    long temp = MakeKey_4(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length);

    if (temp == 0) return null;
    return (vtkInformationObjectBaseVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Clear_5(vtkInformation id0);
  public void Clear(vtkInformation id0)
  {
    Clear_5(id0);
  }

  private native void Resize_6(vtkInformation id0,int id1);
  public void Resize(vtkInformation id0,int id1)
  {
    Resize_6(id0,id1);
  }

  private native int Size_7(vtkInformation id0);
  public int Size(vtkInformation id0)
  {
    return Size_7(id0);
  }

  private native int Length_8(vtkInformation id0);
  public int Length(vtkInformation id0)
  {
    return Length_8(id0);
  }

  private native void Append_9(vtkInformation id0,vtkObjectBase id1);
  public void Append(vtkInformation id0,vtkObjectBase id1)
  {
    Append_9(id0,id1);
  }

  private native void Set_10(vtkInformation id0,vtkObjectBase id1,int id2);
  public void Set(vtkInformation id0,vtkObjectBase id1,int id2)
  {
    Set_10(id0,id1,id2);
  }

  private native void Remove_11(vtkInformation id0,vtkObjectBase id1);
  public void Remove(vtkInformation id0,vtkObjectBase id1)
  {
    Remove_11(id0,id1);
  }

  private native void Remove_12(vtkInformation id0,int id1);
  public void Remove(vtkInformation id0,int id1)
  {
    Remove_12(id0,id1);
  }

  private native long Get_13(vtkInformation id0,int id1);
  public vtkObjectBase Get(vtkInformation id0,int id1)
  {
    long temp = Get_13(id0,id1);

    if (temp == 0) return null;
    return (vtkObjectBase)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ShallowCopy_14(vtkInformation id0,vtkInformation id1);
  public void ShallowCopy(vtkInformation id0,vtkInformation id1)
  {
    ShallowCopy_14(id0,id1);
  }

  private native void Remove_15(vtkInformation id0);
  public void Remove(vtkInformation id0)
  {
    Remove_15(id0);
  }

  public vtkInformationObjectBaseVectorKey() { super(); }

  public vtkInformationObjectBaseVectorKey(long id) { super(id); }

}
