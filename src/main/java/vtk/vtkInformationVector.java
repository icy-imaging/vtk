// java wrapper for vtkInformationVector object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInformationVector extends vtkObject
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

  private native int GetNumberOfInformationObjects_4();
  public int GetNumberOfInformationObjects()
  {
    return GetNumberOfInformationObjects_4();
  }

  private native void SetNumberOfInformationObjects_5(int id0);
  public void SetNumberOfInformationObjects(int id0)
  {
    SetNumberOfInformationObjects_5(id0);
  }

  private native void SetInformationObject_6(int id0,vtkInformation id1);
  public void SetInformationObject(int id0,vtkInformation id1)
  {
    SetInformationObject_6(id0,id1);
  }

  private native long GetInformationObject_7(int id0);
  public vtkInformation GetInformationObject(int id0)
  {
    long temp = GetInformationObject_7(id0);

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Append_8(vtkInformation id0);
  public void Append(vtkInformation id0)
  {
    Append_8(id0);
  }

  private native void Remove_9(vtkInformation id0);
  public void Remove(vtkInformation id0)
  {
    Remove_9(id0);
  }

  private native void Remove_10(int id0);
  public void Remove(int id0)
  {
    Remove_10(id0);
  }

  private native boolean UsesGarbageCollector_11();
  public boolean UsesGarbageCollector()
  {
    return UsesGarbageCollector_11();
  }

  private native void Copy_12(vtkInformationVector id0,int id1);
  public void Copy(vtkInformationVector id0,int id1)
  {
    Copy_12(id0,id1);
  }

  public vtkInformationVector() { super(); }

  public vtkInformationVector(long id) { super(id); }
  public native long   VTKInit();

}
