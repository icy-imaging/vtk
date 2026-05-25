// java wrapper for vtkDataSetCollection object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataSetCollection extends vtkCollection
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

  private native void AddItem_4(vtkDataSet id0);
  public void AddItem(vtkDataSet id0)
  {
    AddItem_4(id0);
  }

  private native long GetNextItem_5();
  public vtkDataSet GetNextItem()
  {
    long temp = GetNextItem_5();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNextDataSet_6();
  public vtkDataSet GetNextDataSet()
  {
    long temp = GetNextDataSet_6();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetItem_7(int id0);
  public vtkDataSet GetItem(int id0)
  {
    long temp = GetItem_7(id0);

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDataSet_8(int id0);
  public vtkDataSet GetDataSet(int id0)
  {
    long temp = GetDataSet_8(id0);

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkDataSetCollection() { super(); }

  public vtkDataSetCollection(long id) { super(id); }
  public native long   VTKInit();

}
