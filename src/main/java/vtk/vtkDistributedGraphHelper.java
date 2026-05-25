// java wrapper for vtkDistributedGraphHelper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDistributedGraphHelper extends vtkObject
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

  private native long GetVertexOwner_4(long id0);
  public long GetVertexOwner(long id0)
  {
    return GetVertexOwner_4(id0);
  }

  private native long GetVertexIndex_5(long id0);
  public long GetVertexIndex(long id0)
  {
    return GetVertexIndex_5(id0);
  }

  private native long GetEdgeOwner_6(long id0);
  public long GetEdgeOwner(long id0)
  {
    return GetEdgeOwner_6(id0);
  }

  private native long GetEdgeIndex_7(long id0);
  public long GetEdgeIndex(long id0)
  {
    return GetEdgeIndex_7(id0);
  }

  private native long MakeDistributedId_8(int id0,long id1);
  public long MakeDistributedId(int id0,long id1)
  {
    return MakeDistributedId_8(id0,id1);
  }

  private native void Synchronize_9();
  public void Synchronize()
  {
    Synchronize_9();
  }

  private native long Clone_10();
  public vtkDistributedGraphHelper Clone()
  {
    long temp = Clone_10();

    if (temp == 0) return null;
    return (vtkDistributedGraphHelper)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long DISTRIBUTEDVERTEXIDS_11();
  public vtkInformationIntegerKey DISTRIBUTEDVERTEXIDS()
  {
    long temp = DISTRIBUTEDVERTEXIDS_11();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long DISTRIBUTEDEDGEIDS_12();
  public vtkInformationIntegerKey DISTRIBUTEDEDGEIDS()
  {
    long temp = DISTRIBUTEDEDGEIDS_12();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkDistributedGraphHelper() { super(); }

  public vtkDistributedGraphHelper(long id) { super(id); }

}
