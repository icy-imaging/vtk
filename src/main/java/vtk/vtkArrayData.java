// java wrapper for vtkArrayData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkArrayData extends vtkDataObject
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

  private native long GetData_4(vtkInformation id0);
  public vtkArrayData GetData(vtkInformation id0)
  {
    long temp = GetData_4(id0);

    if (temp == 0) return null;
    return (vtkArrayData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_5(vtkInformationVector id0,int id1);
  public vtkArrayData GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_5(id0,id1);

    if (temp == 0) return null;
    return (vtkArrayData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void AddArray_6(vtkArray id0);
  public void AddArray(vtkArray id0)
  {
    AddArray_6(id0);
  }

  private native void ClearArrays_7();
  public void ClearArrays()
  {
    ClearArrays_7();
  }

  private native long GetNumberOfArrays_8();
  public long GetNumberOfArrays()
  {
    return GetNumberOfArrays_8();
  }

  private native long GetArray_9(long id0);
  public vtkArray GetArray(long id0)
  {
    long temp = GetArray_9(id0);

    if (temp == 0) return null;
    return (vtkArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetArrayByName_10(byte[] id0, int len0);
  public vtkArray GetArrayByName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetArrayByName_10(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetDataObjectType_11();
  public int GetDataObjectType()
  {
    return GetDataObjectType_11();
  }

  private native void ShallowCopy_12(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_12(id0);
  }

  private native void DeepCopy_13(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_13(id0);
  }

  public vtkArrayData() { super(); }

  public vtkArrayData(long id) { super(id); }
  public native long   VTKInit();

}
