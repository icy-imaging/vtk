// java wrapper for vtkDataArrayCollectionIterator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataArrayCollectionIterator extends vtkCollectionIterator
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

  private native void SetCollection_4(vtkCollection id0);
  public void SetCollection(vtkCollection id0)
  {
    SetCollection_4(id0);
  }

  private native void SetCollection_5(vtkDataArrayCollection id0);
  public void SetCollection(vtkDataArrayCollection id0)
  {
    SetCollection_5(id0);
  }

  private native long GetDataArray_6();
  public vtkDataArray GetDataArray()
  {
    long temp = GetDataArray_6();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkDataArrayCollectionIterator() { super(); }

  public vtkDataArrayCollectionIterator(long id) { super(id); }
  public native long   VTKInit();

}
