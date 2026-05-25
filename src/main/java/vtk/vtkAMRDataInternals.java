// java wrapper for vtkAMRDataInternals object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAMRDataInternals extends vtkObject
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

  private native void Initialize_4();
  public void Initialize()
  {
    Initialize_4();
  }

  private native void Insert_5(int id0,vtkUniformGrid id1);
  public void Insert(int id0,vtkUniformGrid id1)
  {
    Insert_5(id0,id1);
  }

  private native long GetDataSet_6(int id0);
  public vtkUniformGrid GetDataSet(int id0)
  {
    long temp = GetDataSet_6(id0);

    if (temp == 0) return null;
    return (vtkUniformGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CompositeShallowCopy_7(vtkObject id0);
  public void CompositeShallowCopy(vtkObject id0)
  {
    CompositeShallowCopy_7(id0);
  }

  private native void ShallowCopy_8(vtkObject id0);
  public void ShallowCopy(vtkObject id0)
  {
    ShallowCopy_8(id0);
  }

  private native void DeepCopy_9(vtkObject id0);
  public void DeepCopy(vtkObject id0)
  {
    DeepCopy_9(id0);
  }

  private native boolean Empty_10();
  public boolean Empty()
  {
    return Empty_10();
  }

  private native int GetNumberOfBlocks_11();
  public int GetNumberOfBlocks()
  {
    return GetNumberOfBlocks_11();
  }

  public vtkAMRDataInternals() { super(); }

  public vtkAMRDataInternals(long id) { super(id); }
  public native long   VTKInit();

}
