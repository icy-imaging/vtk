// java wrapper for vtkSubGroup object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSubGroup extends vtkObject
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

  private native int Initialize_4(int id0,int id1,int id2,int id3,vtkCommunicator id4);
  public int Initialize(int id0,int id1,int id2,int id3,vtkCommunicator id4)
  {
    return Initialize_4(id0,id1,id2,id3,id4);
  }

  private native int Gather_5(byte[] id0, int len0,byte[] id1, int len1,int id2,int id3);
  public int Gather(String id0,String id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return Gather_5(bytes0, bytes0.length,bytes1, bytes1.length,id2,id3);
  }

  private native int Broadcast_6(byte[] id0, int len0,int id1,int id2);
  public int Broadcast(String id0,int id1,int id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return Broadcast_6(bytes0, bytes0.length,id1,id2);
  }

  private native void setGatherPattern_7(int id0,int id1);
  public void setGatherPattern(int id0,int id1)
  {
    setGatherPattern_7(id0,id1);
  }

  private native int getLocalRank_8(int id0);
  public int getLocalRank(int id0)
  {
    return getLocalRank_8(id0);
  }

  private native int Barrier_9();
  public int Barrier()
  {
    return Barrier_9();
  }

  private native void PrintSubGroup_10();
  public void PrintSubGroup()
  {
    PrintSubGroup_10();
  }

  public vtkSubGroup() { super(); }

  public vtkSubGroup(long id) { super(id); }
  public native long   VTKInit();

}
