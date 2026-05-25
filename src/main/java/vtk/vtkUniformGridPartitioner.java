// java wrapper for vtkUniformGridPartitioner object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkUniformGridPartitioner extends vtkMultiBlockDataSetAlgorithm
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

  private native int GetNumberOfPartitions_4();
  public int GetNumberOfPartitions()
  {
    return GetNumberOfPartitions_4();
  }

  private native void SetNumberOfPartitions_5(int id0);
  public void SetNumberOfPartitions(int id0)
  {
    SetNumberOfPartitions_5(id0);
  }

  private native int GetNumberOfGhostLayers_6();
  public int GetNumberOfGhostLayers()
  {
    return GetNumberOfGhostLayers_6();
  }

  private native void SetNumberOfGhostLayers_7(int id0);
  public void SetNumberOfGhostLayers(int id0)
  {
    SetNumberOfGhostLayers_7(id0);
  }

  private native int GetDuplicateNodes_8();
  public int GetDuplicateNodes()
  {
    return GetDuplicateNodes_8();
  }

  private native void SetDuplicateNodes_9(int id0);
  public void SetDuplicateNodes(int id0)
  {
    SetDuplicateNodes_9(id0);
  }

  private native void DuplicateNodesOn_10();
  public void DuplicateNodesOn()
  {
    DuplicateNodesOn_10();
  }

  private native void DuplicateNodesOff_11();
  public void DuplicateNodesOff()
  {
    DuplicateNodesOff_11();
  }

  public vtkUniformGridPartitioner() { super(); }

  public vtkUniformGridPartitioner(long id) { super(id); }
  public native long   VTKInit();

}
