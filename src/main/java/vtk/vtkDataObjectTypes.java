// java wrapper for vtkDataObjectTypes object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataObjectTypes extends vtkObject
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

  private native byte[] GetClassNameFromTypeId_4(int id0);
  public String GetClassNameFromTypeId(int id0)
  {
    return new String(GetClassNameFromTypeId_4(id0), StandardCharsets.UTF_8);
  }

  private native int GetTypeIdFromClassName_5(byte[] id0, int len0);
  public int GetTypeIdFromClassName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetTypeIdFromClassName_5(bytes0, bytes0.length);
  }

  private native long NewDataObject_6(byte[] id0, int len0);
  public vtkDataObject NewDataObject(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = NewDataObject_6(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long NewDataObject_7(int id0);
  public vtkDataObject NewDataObject(int id0)
  {
    long temp = NewDataObject_7(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean TypeIdIsA_8(int id0,int id1);
  public boolean TypeIdIsA(int id0,int id1)
  {
    return TypeIdIsA_8(id0,id1);
  }

  private native int GetCommonBaseTypeId_9(int id0,int id1);
  public int GetCommonBaseTypeId(int id0,int id1)
  {
    return GetCommonBaseTypeId_9(id0,id1);
  }

  public vtkDataObjectTypes() { super(); }

  public vtkDataObjectTypes(long id) { super(id); }
  public native long   VTKInit();

}
