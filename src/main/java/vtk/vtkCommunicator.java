// java wrapper for vtkCommunicator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCommunicator extends vtkObject
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

  private native void SetNumberOfProcesses_4(int id0);
  public void SetNumberOfProcesses(int id0)
  {
    SetNumberOfProcesses_4(id0);
  }

  private native int GetNumberOfProcesses_5();
  public int GetNumberOfProcesses()
  {
    return GetNumberOfProcesses_5();
  }

  private native int GetLocalProcessId_6();
  public int GetLocalProcessId()
  {
    return GetLocalProcessId_6();
  }

  private native int Send_7(vtkDataObject id0,int id1,int id2);
  public int Send(vtkDataObject id0,int id1,int id2)
  {
    return Send_7(id0,id1,id2);
  }

  private native int Send_8(vtkDataArray id0,int id1,int id2);
  public int Send(vtkDataArray id0,int id1,int id2)
  {
    return Send_8(id0,id1,id2);
  }

  private native int Send_9(byte[] id0, int len0,long id1,int id2,int id3);
  public int Send(String id0,long id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return Send_9(bytes0, bytes0.length,id1,id2,id3);
  }

  private native int Receive_10(vtkDataObject id0,int id1,int id2);
  public int Receive(vtkDataObject id0,int id1,int id2)
  {
    return Receive_10(id0,id1,id2);
  }

  private native long ReceiveDataObject_11(int id0,int id1);
  public vtkDataObject ReceiveDataObject(int id0,int id1)
  {
    long temp = ReceiveDataObject_11(id0,id1);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int Receive_12(vtkDataArray id0,int id1,int id2);
  public int Receive(vtkDataArray id0,int id1,int id2)
  {
    return Receive_12(id0,id1,id2);
  }

  private native int Receive_13(byte[] id0, int len0,long id1,int id2,int id3);
  public int Receive(String id0,long id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return Receive_13(bytes0, bytes0.length,id1,id2,id3);
  }

  private native long GetCount_14();
  public long GetCount()
  {
    return GetCount_14();
  }

  private native void Barrier_15();
  public void Barrier()
  {
    Barrier_15();
  }

  private native int Broadcast_16(byte[] id0, int len0,long id1,int id2);
  public int Broadcast(String id0,long id1,int id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return Broadcast_16(bytes0, bytes0.length,id1,id2);
  }

  private native int Broadcast_17(vtkDataObject id0,int id1);
  public int Broadcast(vtkDataObject id0,int id1)
  {
    return Broadcast_17(id0,id1);
  }

  private native int Broadcast_18(vtkDataArray id0,int id1);
  public int Broadcast(vtkDataArray id0,int id1)
  {
    return Broadcast_18(id0,id1);
  }

  private native int Gather_19(byte[] id0, int len0,byte[] id1, int len1,long id2,int id3);
  public int Gather(String id0,String id1,long id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return Gather_19(bytes0, bytes0.length,bytes1, bytes1.length,id2,id3);
  }

  private native int Gather_20(vtkDataArray id0,vtkDataArray id1,int id2);
  public int Gather(vtkDataArray id0,vtkDataArray id1,int id2)
  {
    return Gather_20(id0,id1,id2);
  }

  private native int GatherV_21(vtkDataArray id0,vtkDataArray id1,vtkIdTypeArray id2,vtkIdTypeArray id3,int id4);
  public int GatherV(vtkDataArray id0,vtkDataArray id1,vtkIdTypeArray id2,vtkIdTypeArray id3,int id4)
  {
    return GatherV_21(id0,id1,id2,id3,id4);
  }

  private native int GatherV_22(vtkDataArray id0,vtkDataArray id1,int id2);
  public int GatherV(vtkDataArray id0,vtkDataArray id1,int id2)
  {
    return GatherV_22(id0,id1,id2);
  }

  private native int Scatter_23(byte[] id0, int len0,byte[] id1, int len1,long id2,int id3);
  public int Scatter(String id0,String id1,long id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return Scatter_23(bytes0, bytes0.length,bytes1, bytes1.length,id2,id3);
  }

  private native int Scatter_24(vtkDataArray id0,vtkDataArray id1,int id2);
  public int Scatter(vtkDataArray id0,vtkDataArray id1,int id2)
  {
    return Scatter_24(id0,id1,id2);
  }

  private native int AllGather_25(byte[] id0, int len0,byte[] id1, int len1,long id2);
  public int AllGather(String id0,String id1,long id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return AllGather_25(bytes0, bytes0.length,bytes1, bytes1.length,id2);
  }

  private native int AllGather_26(vtkDataArray id0,vtkDataArray id1);
  public int AllGather(vtkDataArray id0,vtkDataArray id1)
  {
    return AllGather_26(id0,id1);
  }

  private native int AllGatherV_27(vtkDataArray id0,vtkDataArray id1);
  public int AllGatherV(vtkDataArray id0,vtkDataArray id1)
  {
    return AllGatherV_27(id0,id1);
  }

  private native int Reduce_28(byte[] id0, int len0,byte[] id1, int len1,long id2,int id3,int id4);
  public int Reduce(String id0,String id1,long id2,int id3,int id4)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return Reduce_28(bytes0, bytes0.length,bytes1, bytes1.length,id2,id3,id4);
  }

  private native int Reduce_29(vtkDataArray id0,vtkDataArray id1,int id2,int id3);
  public int Reduce(vtkDataArray id0,vtkDataArray id1,int id2,int id3)
  {
    return Reduce_29(id0,id1,id2,id3);
  }

  private native int AllReduce_30(byte[] id0, int len0,byte[] id1, int len1,long id2,int id3);
  public int AllReduce(String id0,String id1,long id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return AllReduce_30(bytes0, bytes0.length,bytes1, bytes1.length,id2,id3);
  }

  private native int AllReduce_31(vtkDataArray id0,vtkDataArray id1,int id2);
  public int AllReduce(vtkDataArray id0,vtkDataArray id1,int id2)
  {
    return AllReduce_31(id0,id1,id2);
  }

  private native boolean CanProbe_32();
  public boolean CanProbe()
  {
    return CanProbe_32();
  }

  private native void SetUseCopy_33(int id0);
  public void SetUseCopy(int id0)
  {
    SetUseCopy_33(id0);
  }

  private native int GetParentProcessor_34(int id0);
  public int GetParentProcessor(int id0)
  {
    return GetParentProcessor_34(id0);
  }

  private native int GetLeftChildProcessor_35(int id0);
  public int GetLeftChildProcessor(int id0)
  {
    return GetLeftChildProcessor_35(id0);
  }

  private native int MarshalDataObject_36(vtkDataObject id0,vtkCharArray id1);
  public int MarshalDataObject(vtkDataObject id0,vtkCharArray id1)
  {
    return MarshalDataObject_36(id0,id1);
  }

  private native int UnMarshalDataObject_37(vtkCharArray id0,vtkDataObject id1);
  public int UnMarshalDataObject(vtkCharArray id0,vtkDataObject id1)
  {
    return UnMarshalDataObject_37(id0,id1);
  }

  public vtkCommunicator() { super(); }

  public vtkCommunicator(long id) { super(id); }

}
