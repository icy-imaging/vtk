// java wrapper for vtkDataAssemblyUtilities object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataAssemblyUtilities extends vtkObject
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

  private native byte[] HierarchyName_4();
  public String HierarchyName()
  {
    return new String(HierarchyName_4(), StandardCharsets.UTF_8);
  }

  private native boolean GenerateHierarchy_5(vtkCompositeDataSet id0,vtkDataAssembly id1,vtkPartitionedDataSetCollection id2);
  public boolean GenerateHierarchy(vtkCompositeDataSet id0,vtkDataAssembly id1,vtkPartitionedDataSetCollection id2)
  {
    return GenerateHierarchy_5(id0,id1,id2);
  }

  private native byte[] GetSelectorForCompositeId_6(int id0,vtkDataAssembly id1);
  public String GetSelectorForCompositeId(int id0,vtkDataAssembly id1)
  {
    return new String(GetSelectorForCompositeId_6(id0,id1), StandardCharsets.UTF_8);
  }

  public vtkDataAssemblyUtilities() { super(); }

  public vtkDataAssemblyUtilities(long id) { super(id); }
  public native long   VTKInit();

}
