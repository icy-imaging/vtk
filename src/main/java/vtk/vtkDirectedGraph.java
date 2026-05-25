// java wrapper for vtkDirectedGraph object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDirectedGraph extends vtkGraph
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

  private native int GetDataObjectType_4();
  public int GetDataObjectType()
  {
    return GetDataObjectType_4();
  }

  private native long GetData_5(vtkInformation id0);
  public vtkDirectedGraph GetData(vtkInformation id0)
  {
    long temp = GetData_5(id0);

    if (temp == 0) return null;
    return (vtkDirectedGraph)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_6(vtkInformationVector id0,int id1);
  public vtkDirectedGraph GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_6(id0,id1);

    if (temp == 0) return null;
    return (vtkDirectedGraph)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean IsStructureValid_7(vtkGraph id0);
  public boolean IsStructureValid(vtkGraph id0)
  {
    return IsStructureValid_7(id0);
  }

  public vtkDirectedGraph() { super(); }

  public vtkDirectedGraph(long id) { super(id); }
  public native long   VTKInit();

}
