// java wrapper for vtkMultiProcessController object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMultiProcessController extends vtkObject
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

  private native void Finalize_4();
  public void Finalize()
  {
    Finalize_4();
  }

  private native void Finalize_5(int id0);
  public void Finalize(int id0)
  {
    Finalize_5(id0);
  }

  private native void SetNumberOfProcesses_6(int id0);
  public void SetNumberOfProcesses(int id0)
  {
    SetNumberOfProcesses_6(id0);
  }

  private native int GetNumberOfProcesses_7();
  public int GetNumberOfProcesses()
  {
    return GetNumberOfProcesses_7();
  }

  private native void SetSingleProcessObject_8(vtkProcess id0);
  public void SetSingleProcessObject(vtkProcess id0)
  {
    SetSingleProcessObject_8(id0);
  }

  private native void SingleMethodExecute_9();
  public void SingleMethodExecute()
  {
    SingleMethodExecute_9();
  }

  private native void MultipleMethodExecute_10();
  public void MultipleMethodExecute()
  {
    MultipleMethodExecute_10();
  }

  private native int GetLocalProcessId_11();
  public int GetLocalProcessId()
  {
    return GetLocalProcessId_11();
  }

  private native long GetGlobalController_12();
  public vtkMultiProcessController GetGlobalController()
  {
    long temp = GetGlobalController_12();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateOutputWindow_13();
  public void CreateOutputWindow()
  {
    CreateOutputWindow_13();
  }

  private native long CreateSubController_14(vtkProcessGroup id0);
  public vtkMultiProcessController CreateSubController(vtkProcessGroup id0)
  {
    long temp = CreateSubController_14(id0);

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long PartitionController_15(int id0,int id1);
  public vtkMultiProcessController PartitionController(int id0,int id1)
  {
    long temp = PartitionController_15(id0,id1);

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int RemoveFirstRMI_16(int id0);
  public int RemoveFirstRMI(int id0)
  {
    return RemoveFirstRMI_16(id0);
  }

  private native int RemoveRMI_17(long id0);
  public int RemoveRMI(long id0)
  {
    return RemoveRMI_17(id0);
  }

  private native void RemoveAllRMICallbacks_18(int id0);
  public void RemoveAllRMICallbacks(int id0)
  {
    RemoveAllRMICallbacks_18(id0);
  }

  private native boolean RemoveRMICallback_19(long id0);
  public boolean RemoveRMICallback(long id0)
  {
    return RemoveRMICallback_19(id0);
  }

  private native void TriggerBreakRMIs_20();
  public void TriggerBreakRMIs()
  {
    TriggerBreakRMIs_20();
  }

  private native void TriggerRMI_21(int id0,byte[] id1, int len1,int id2);
  public void TriggerRMI(int id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    TriggerRMI_21(id0,bytes1, bytes1.length,id2);
  }

  private native void TriggerRMI_22(int id0,int id1);
  public void TriggerRMI(int id0,int id1)
  {
    TriggerRMI_22(id0,id1);
  }

  private native void TriggerRMIOnAllChildren_23(byte[] id0, int len0,int id1);
  public void TriggerRMIOnAllChildren(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    TriggerRMIOnAllChildren_23(bytes0, bytes0.length,id1);
  }

  private native void TriggerRMIOnAllChildren_24(int id0);
  public void TriggerRMIOnAllChildren(int id0)
  {
    TriggerRMIOnAllChildren_24(id0);
  }

  private native int ProcessRMIs_25(int id0,int id1);
  public int ProcessRMIs(int id0,int id1)
  {
    return ProcessRMIs_25(id0,id1);
  }

  private native int ProcessRMIs_26();
  public int ProcessRMIs()
  {
    return ProcessRMIs_26();
  }

  private native int BroadcastProcessRMIs_27(int id0,int id1);
  public int BroadcastProcessRMIs(int id0,int id1)
  {
    return BroadcastProcessRMIs_27(id0,id1);
  }

  private native void SetBreakFlag_28(int id0);
  public void SetBreakFlag(int id0)
  {
    SetBreakFlag_28(id0);
  }

  private native int GetBreakFlag_29();
  public int GetBreakFlag()
  {
    return GetBreakFlag_29();
  }

  private native void SetBroadcastTriggerRMI_30(boolean id0);
  public void SetBroadcastTriggerRMI(boolean id0)
  {
    SetBroadcastTriggerRMI_30(id0);
  }

  private native boolean GetBroadcastTriggerRMI_31();
  public boolean GetBroadcastTriggerRMI()
  {
    return GetBroadcastTriggerRMI_31();
  }

  private native void BroadcastTriggerRMIOn_32();
  public void BroadcastTriggerRMIOn()
  {
    BroadcastTriggerRMIOn_32();
  }

  private native void BroadcastTriggerRMIOff_33();
  public void BroadcastTriggerRMIOff()
  {
    BroadcastTriggerRMIOff_33();
  }

  private native long GetCommunicator_34();
  public vtkCommunicator GetCommunicator()
  {
    long temp = GetCommunicator_34();

    if (temp == 0) return null;
    return (vtkCommunicator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetBreakRMITag_35();
  public int GetBreakRMITag()
  {
    return GetBreakRMITag_35();
  }

  private native int GetRMITag_36();
  public int GetRMITag()
  {
    return GetRMITag_36();
  }

  private native int GetRMIArgTag_37();
  public int GetRMIArgTag()
  {
    return GetRMIArgTag_37();
  }

  private native void Barrier_38();
  public void Barrier()
  {
    Barrier_38();
  }

  private native void SetGlobalController_39(vtkMultiProcessController id0);
  public void SetGlobalController(vtkMultiProcessController id0)
  {
    SetGlobalController_39(id0);
  }

  private native int Send_40(byte[] id0, int len0,long id1,int id2,int id3);
  public int Send(String id0,long id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return Send_40(bytes0, bytes0.length,id1,id2,id3);
  }

  private native int Send_41(vtkDataObject id0,int id1,int id2);
  public int Send(vtkDataObject id0,int id1,int id2)
  {
    return Send_41(id0,id1,id2);
  }

  private native int Send_42(vtkDataArray id0,int id1,int id2);
  public int Send(vtkDataArray id0,int id1,int id2)
  {
    return Send_42(id0,id1,id2);
  }

  private native int Receive_43(byte[] id0, int len0,long id1,int id2,int id3);
  public int Receive(String id0,long id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return Receive_43(bytes0, bytes0.length,id1,id2,id3);
  }

  private native int Receive_44(vtkDataObject id0,int id1,int id2);
  public int Receive(vtkDataObject id0,int id1,int id2)
  {
    return Receive_44(id0,id1,id2);
  }

  private native int Receive_45(vtkDataArray id0,int id1,int id2);
  public int Receive(vtkDataArray id0,int id1,int id2)
  {
    return Receive_45(id0,id1,id2);
  }

  private native long ReceiveDataObject_46(int id0,int id1);
  public vtkDataObject ReceiveDataObject(int id0,int id1)
  {
    long temp = ReceiveDataObject_46(id0,id1);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCount_47();
  public long GetCount()
  {
    return GetCount_47();
  }

  private native int Broadcast_48(byte[] id0, int len0,long id1,int id2);
  public int Broadcast(String id0,long id1,int id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return Broadcast_48(bytes0, bytes0.length,id1,id2);
  }

  private native int Broadcast_49(vtkDataObject id0,int id1);
  public int Broadcast(vtkDataObject id0,int id1)
  {
    return Broadcast_49(id0,id1);
  }

  private native int Broadcast_50(vtkDataArray id0,int id1);
  public int Broadcast(vtkDataArray id0,int id1)
  {
    return Broadcast_50(id0,id1);
  }

  private native int Gather_51(byte[] id0, int len0,byte[] id1, int len1,long id2,int id3);
  public int Gather(String id0,String id1,long id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return Gather_51(bytes0, bytes0.length,bytes1, bytes1.length,id2,id3);
  }

  private native int Gather_52(vtkDataArray id0,vtkDataArray id1,int id2);
  public int Gather(vtkDataArray id0,vtkDataArray id1,int id2)
  {
    return Gather_52(id0,id1,id2);
  }

  private native int GatherV_53(vtkDataArray id0,vtkDataArray id1,vtkIdTypeArray id2,vtkIdTypeArray id3,int id4);
  public int GatherV(vtkDataArray id0,vtkDataArray id1,vtkIdTypeArray id2,vtkIdTypeArray id3,int id4)
  {
    return GatherV_53(id0,id1,id2,id3,id4);
  }

  private native int GatherV_54(vtkDataArray id0,vtkDataArray id1,int id2);
  public int GatherV(vtkDataArray id0,vtkDataArray id1,int id2)
  {
    return GatherV_54(id0,id1,id2);
  }

  private native int Scatter_55(byte[] id0, int len0,byte[] id1, int len1,long id2,int id3);
  public int Scatter(String id0,String id1,long id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return Scatter_55(bytes0, bytes0.length,bytes1, bytes1.length,id2,id3);
  }

  private native int Scatter_56(vtkDataArray id0,vtkDataArray id1,int id2);
  public int Scatter(vtkDataArray id0,vtkDataArray id1,int id2)
  {
    return Scatter_56(id0,id1,id2);
  }

  private native int AllGather_57(byte[] id0, int len0,byte[] id1, int len1,long id2);
  public int AllGather(String id0,String id1,long id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return AllGather_57(bytes0, bytes0.length,bytes1, bytes1.length,id2);
  }

  private native int AllGather_58(vtkDataArray id0,vtkDataArray id1);
  public int AllGather(vtkDataArray id0,vtkDataArray id1)
  {
    return AllGather_58(id0,id1);
  }

  private native int AllGatherV_59(vtkDataArray id0,vtkDataArray id1);
  public int AllGatherV(vtkDataArray id0,vtkDataArray id1)
  {
    return AllGatherV_59(id0,id1);
  }

  private native int Reduce_60(byte[] id0, int len0,byte[] id1, int len1,long id2,int id3,int id4);
  public int Reduce(String id0,String id1,long id2,int id3,int id4)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return Reduce_60(bytes0, bytes0.length,bytes1, bytes1.length,id2,id3,id4);
  }

  private native int Reduce_61(vtkDataArray id0,vtkDataArray id1,int id2,int id3);
  public int Reduce(vtkDataArray id0,vtkDataArray id1,int id2,int id3)
  {
    return Reduce_61(id0,id1,id2,id3);
  }

  private native int AllReduce_62(byte[] id0, int len0,byte[] id1, int len1,long id2,int id3);
  public int AllReduce(String id0,String id1,long id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return AllReduce_62(bytes0, bytes0.length,bytes1, bytes1.length,id2,id3);
  }

  private native int AllReduce_63(vtkDataArray id0,vtkDataArray id1,int id2);
  public int AllReduce(vtkDataArray id0,vtkDataArray id1,int id2)
  {
    return AllReduce_63(id0,id1,id2);
  }

  private native int Reduce_64(vtkDataArraySelection id0,vtkDataArraySelection id1,int id2);
  public int Reduce(vtkDataArraySelection id0,vtkDataArraySelection id1,int id2)
  {
    return Reduce_64(id0,id1,id2);
  }

  private native int AllReduce_65(vtkDataArraySelection id0,vtkDataArraySelection id1);
  public int AllReduce(vtkDataArraySelection id0,vtkDataArraySelection id1)
  {
    return AllReduce_65(id0,id1);
  }

  private native boolean CanProbe_66();
  public boolean CanProbe()
  {
    return CanProbe_66();
  }

  public vtkMultiProcessController() { super(); }

  public vtkMultiProcessController(long id) { super(id); }

}
