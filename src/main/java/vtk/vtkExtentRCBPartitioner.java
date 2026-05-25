// java wrapper for vtkExtentRCBPartitioner object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtentRCBPartitioner extends vtkObject
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

  private native void SetNumberOfPartitions_4(int id0);
  public void SetNumberOfPartitions(int id0)
  {
    SetNumberOfPartitions_4(id0);
  }

  private native void SetGlobalExtent_5(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetGlobalExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetGlobalExtent_5(id0,id1,id2,id3,id4,id5);
  }

  private native void SetGlobalExtent_6(int id0[]);
  public void SetGlobalExtent(int id0[])
  {
    SetGlobalExtent_6(id0);
  }

  private native void SetDuplicateNodes_7(int id0);
  public void SetDuplicateNodes(int id0)
  {
    SetDuplicateNodes_7(id0);
  }

  private native int GetDuplicateNodes_8();
  public int GetDuplicateNodes()
  {
    return GetDuplicateNodes_8();
  }

  private native void DuplicateNodesOn_9();
  public void DuplicateNodesOn()
  {
    DuplicateNodesOn_9();
  }

  private native void DuplicateNodesOff_10();
  public void DuplicateNodesOff()
  {
    DuplicateNodesOff_10();
  }

  private native void SetNumberOfGhostLayers_11(int id0);
  public void SetNumberOfGhostLayers(int id0)
  {
    SetNumberOfGhostLayers_11(id0);
  }

  private native int GetNumberOfGhostLayers_12();
  public int GetNumberOfGhostLayers()
  {
    return GetNumberOfGhostLayers_12();
  }

  private native int GetNumExtents_13();
  public int GetNumExtents()
  {
    return GetNumExtents_13();
  }

  private native void Partition_14();
  public void Partition()
  {
    Partition_14();
  }

  private native void GetPartitionExtent_15(int id0,int id1[]);
  public void GetPartitionExtent(int id0,int id1[])
  {
    GetPartitionExtent_15(id0,id1);
  }

  public vtkExtentRCBPartitioner() { super(); }

  public vtkExtentRCBPartitioner(long id) { super(id); }
  public native long   VTKInit();

}
