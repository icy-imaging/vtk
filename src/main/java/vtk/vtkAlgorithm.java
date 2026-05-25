// java wrapper for vtkAlgorithm object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAlgorithm extends vtkObject
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

  private native int HasExecutive_4();
  public int HasExecutive()
  {
    return HasExecutive_4();
  }

  private native long GetExecutive_5();
  public vtkExecutive GetExecutive()
  {
    long temp = GetExecutive_5();

    if (temp == 0) return null;
    return (vtkExecutive)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetExecutive_6(vtkExecutive id0);
  public void SetExecutive(vtkExecutive id0)
  {
    SetExecutive_6(id0);
  }

  private native int ProcessRequest_7(vtkInformation id0,vtkCollection id1,vtkInformationVector id2);
  public int ProcessRequest(vtkInformation id0,vtkCollection id1,vtkInformationVector id2)
  {
    return ProcessRequest_7(id0,id1,id2);
  }

  private native int ModifyRequest_8(vtkInformation id0,int id1);
  public int ModifyRequest(vtkInformation id0,int id1)
  {
    return ModifyRequest_8(id0,id1);
  }

  private native long GetInputPortInformation_9(int id0);
  public vtkInformation GetInputPortInformation(int id0)
  {
    long temp = GetInputPortInformation_9(id0);

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutputPortInformation_10(int id0);
  public vtkInformation GetOutputPortInformation(int id0)
  {
    long temp = GetOutputPortInformation_10(id0);

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInformation_11();
  public vtkInformation GetInformation()
  {
    long temp = GetInformation_11();

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInformation_12(vtkInformation id0);
  public void SetInformation(vtkInformation id0)
  {
    SetInformation_12(id0);
  }

  private native int GetNumberOfInputPorts_13();
  public int GetNumberOfInputPorts()
  {
    return GetNumberOfInputPorts_13();
  }

  private native int GetNumberOfOutputPorts_14();
  public int GetNumberOfOutputPorts()
  {
    return GetNumberOfOutputPorts_14();
  }

  private native boolean UsesGarbageCollector_15();
  public boolean UsesGarbageCollector()
  {
    return UsesGarbageCollector_15();
  }

  private native void SetAbortExecuteAndUpdateTime_16();
  public void SetAbortExecuteAndUpdateTime()
  {
    SetAbortExecuteAndUpdateTime_16();
  }

  private native void SetAbortExecute_17(int id0);
  public void SetAbortExecute(int id0)
  {
    SetAbortExecute_17(id0);
  }

  private native int GetAbortExecute_18();
  public int GetAbortExecute()
  {
    return GetAbortExecute_18();
  }

  private native void AbortExecuteOn_19();
  public void AbortExecuteOn()
  {
    AbortExecuteOn_19();
  }

  private native void AbortExecuteOff_20();
  public void AbortExecuteOff()
  {
    AbortExecuteOff_20();
  }

  private native double GetProgress_21();
  public double GetProgress()
  {
    return GetProgress_21();
  }

  private native void UpdateProgress_22(double id0);
  public void UpdateProgress(double id0)
  {
    UpdateProgress_22(id0);
  }

  private native boolean CheckAbort_23();
  public boolean CheckAbort()
  {
    return CheckAbort_23();
  }

  private native void SetContainerAlgorithm_24(vtkAlgorithm id0);
  public void SetContainerAlgorithm(vtkAlgorithm id0)
  {
    SetContainerAlgorithm_24(id0);
  }

  private native long GetContainerAlgorithm_25();
  public vtkAlgorithm GetContainerAlgorithm()
  {
    long temp = GetContainerAlgorithm_25();

    if (temp == 0) return null;
    return (vtkAlgorithm)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAbortOutput_26(boolean id0);
  public void SetAbortOutput(boolean id0)
  {
    SetAbortOutput_26(id0);
  }

  private native boolean GetAbortOutput_27();
  public boolean GetAbortOutput()
  {
    return GetAbortOutput_27();
  }

  private native void SetProgressShiftScale_28(double id0,double id1);
  public void SetProgressShiftScale(double id0,double id1)
  {
    SetProgressShiftScale_28(id0,id1);
  }

  private native double GetProgressShift_29();
  public double GetProgressShift()
  {
    return GetProgressShift_29();
  }

  private native double GetProgressScale_30();
  public double GetProgressScale()
  {
    return GetProgressScale_30();
  }

  private native void SetProgressText_31(byte[] id0, int len0);
  public void SetProgressText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetProgressText_31(bytes0, bytes0.length);
  }

  private native byte[] GetProgressText_32();
  public String GetProgressText()
  {
    return new String(GetProgressText_32(), StandardCharsets.UTF_8);
  }

  private native long GetErrorCode_33();
  public long GetErrorCode()
  {
    return GetErrorCode_33();
  }

  private native long INPUT_IS_OPTIONAL_34();
  public vtkInformationIntegerKey INPUT_IS_OPTIONAL()
  {
    long temp = INPUT_IS_OPTIONAL_34();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long INPUT_IS_REPEATABLE_35();
  public vtkInformationIntegerKey INPUT_IS_REPEATABLE()
  {
    long temp = INPUT_IS_REPEATABLE_35();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long INPUT_REQUIRED_FIELDS_36();
  public vtkInformationInformationVectorKey INPUT_REQUIRED_FIELDS()
  {
    long temp = INPUT_REQUIRED_FIELDS_36();

    if (temp == 0) return null;
    return (vtkInformationInformationVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long INPUT_REQUIRED_DATA_TYPE_37();
  public vtkInformationStringVectorKey INPUT_REQUIRED_DATA_TYPE()
  {
    long temp = INPUT_REQUIRED_DATA_TYPE_37();

    if (temp == 0) return null;
    return (vtkInformationStringVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long INPUT_ARRAYS_TO_PROCESS_38();
  public vtkInformationInformationVectorKey INPUT_ARRAYS_TO_PROCESS()
  {
    long temp = INPUT_ARRAYS_TO_PROCESS_38();

    if (temp == 0) return null;
    return (vtkInformationInformationVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long INPUT_PORT_39();
  public vtkInformationIntegerKey INPUT_PORT()
  {
    long temp = INPUT_PORT_39();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long INPUT_CONNECTION_40();
  public vtkInformationIntegerKey INPUT_CONNECTION()
  {
    long temp = INPUT_CONNECTION_40();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long CAN_PRODUCE_SUB_EXTENT_41();
  public vtkInformationIntegerKey CAN_PRODUCE_SUB_EXTENT()
  {
    long temp = CAN_PRODUCE_SUB_EXTENT_41();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long CAN_HANDLE_PIECE_REQUEST_42();
  public vtkInformationIntegerKey CAN_HANDLE_PIECE_REQUEST()
  {
    long temp = CAN_HANDLE_PIECE_REQUEST_42();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ABORTED_43();
  public vtkInformationIntegerKey ABORTED()
  {
    long temp = ABORTED_43();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInputArrayToProcess_44(int id0,int id1,int id2,int id3,byte[] id4, int len4);
  public void SetInputArrayToProcess(int id0,int id1,int id2,int id3,String id4)
  {
    byte[] bytes4 = id4.getBytes(StandardCharsets.UTF_8);
    SetInputArrayToProcess_44(id0,id1,id2,id3,bytes4, bytes4.length);
  }

  private native void SetInputArrayToProcess_45(int id0,int id1,int id2,int id3,int id4);
  public void SetInputArrayToProcess(int id0,int id1,int id2,int id3,int id4)
  {
    SetInputArrayToProcess_45(id0,id1,id2,id3,id4);
  }

  private native void SetInputArrayToProcess_46(int id0,vtkInformation id1);
  public void SetInputArrayToProcess(int id0,vtkInformation id1)
  {
    SetInputArrayToProcess_46(id0,id1);
  }

  private native void SetInputArrayToProcess_47(int id0,int id1,int id2,byte[] id3, int len3,byte[] id4, int len4);
  public void SetInputArrayToProcess(int id0,int id1,int id2,String id3,String id4)
  {
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    byte[] bytes4 = id4.getBytes(StandardCharsets.UTF_8);
    SetInputArrayToProcess_47(id0,id1,id2,bytes3, bytes3.length,bytes4, bytes4.length);
  }

  private native long GetInputArrayInformation_48(int id0);
  public vtkInformation GetInputArrayInformation(int id0)
  {
    long temp = GetInputArrayInformation_48(id0);

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void RemoveAllInputs_49();
  public void RemoveAllInputs()
  {
    RemoveAllInputs_49();
  }

  private native long GetOutputDataObject_50(int id0);
  public vtkDataObject GetOutputDataObject(int id0)
  {
    long temp = GetOutputDataObject_50(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInputDataObject_51(int id0,int id1);
  public vtkDataObject GetInputDataObject(int id0,int id1)
  {
    long temp = GetInputDataObject_51(id0,id1);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInputConnection_52(int id0,vtkAlgorithmOutput id1);
  public void SetInputConnection(int id0,vtkAlgorithmOutput id1)
  {
    SetInputConnection_52(id0,id1);
  }

  private native void SetInputConnection_53(vtkAlgorithmOutput id0);
  public void SetInputConnection(vtkAlgorithmOutput id0)
  {
    SetInputConnection_53(id0);
  }

  private native void AddInputConnection_54(int id0,vtkAlgorithmOutput id1);
  public void AddInputConnection(int id0,vtkAlgorithmOutput id1)
  {
    AddInputConnection_54(id0,id1);
  }

  private native void AddInputConnection_55(vtkAlgorithmOutput id0);
  public void AddInputConnection(vtkAlgorithmOutput id0)
  {
    AddInputConnection_55(id0);
  }

  private native void RemoveInputConnection_56(int id0,vtkAlgorithmOutput id1);
  public void RemoveInputConnection(int id0,vtkAlgorithmOutput id1)
  {
    RemoveInputConnection_56(id0,id1);
  }

  private native void RemoveInputConnection_57(int id0,int id1);
  public void RemoveInputConnection(int id0,int id1)
  {
    RemoveInputConnection_57(id0,id1);
  }

  private native void RemoveAllInputConnections_58(int id0);
  public void RemoveAllInputConnections(int id0)
  {
    RemoveAllInputConnections_58(id0);
  }

  private native void SetInputDataObject_59(int id0,vtkDataObject id1);
  public void SetInputDataObject(int id0,vtkDataObject id1)
  {
    SetInputDataObject_59(id0,id1);
  }

  private native void SetInputDataObject_60(vtkDataObject id0);
  public void SetInputDataObject(vtkDataObject id0)
  {
    SetInputDataObject_60(id0);
  }

  private native void AddInputDataObject_61(int id0,vtkDataObject id1);
  public void AddInputDataObject(int id0,vtkDataObject id1)
  {
    AddInputDataObject_61(id0,id1);
  }

  private native void AddInputDataObject_62(vtkDataObject id0);
  public void AddInputDataObject(vtkDataObject id0)
  {
    AddInputDataObject_62(id0);
  }

  private native long GetOutputPort_63(int id0);
  public vtkAlgorithmOutput GetOutputPort(int id0)
  {
    long temp = GetOutputPort_63(id0);

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutputPort_64();
  public vtkAlgorithmOutput GetOutputPort()
  {
    long temp = GetOutputPort_64();

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfInputConnections_65(int id0);
  public int GetNumberOfInputConnections(int id0)
  {
    return GetNumberOfInputConnections_65(id0);
  }

  private native int GetTotalNumberOfInputConnections_66();
  public int GetTotalNumberOfInputConnections()
  {
    return GetTotalNumberOfInputConnections_66();
  }

  private native long GetInputConnection_67(int id0,int id1);
  public vtkAlgorithmOutput GetInputConnection(int id0,int id1)
  {
    long temp = GetInputConnection_67(id0,id1);

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInputAlgorithm_68(int id0,int id1);
  public vtkAlgorithm GetInputAlgorithm(int id0,int id1)
  {
    long temp = GetInputAlgorithm_68(id0,id1);

    if (temp == 0) return null;
    return (vtkAlgorithm)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInputAlgorithm_69();
  public vtkAlgorithm GetInputAlgorithm()
  {
    long temp = GetInputAlgorithm_69();

    if (temp == 0) return null;
    return (vtkAlgorithm)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInputExecutive_70(int id0,int id1);
  public vtkExecutive GetInputExecutive(int id0,int id1)
  {
    long temp = GetInputExecutive_70(id0,id1);

    if (temp == 0) return null;
    return (vtkExecutive)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInputExecutive_71();
  public vtkExecutive GetInputExecutive()
  {
    long temp = GetInputExecutive_71();

    if (temp == 0) return null;
    return (vtkExecutive)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInputInformation_72(int id0,int id1);
  public vtkInformation GetInputInformation(int id0,int id1)
  {
    long temp = GetInputInformation_72(id0,id1);

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInputInformation_73();
  public vtkInformation GetInputInformation()
  {
    long temp = GetInputInformation_73();

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutputInformation_74(int id0);
  public vtkInformation GetOutputInformation(int id0)
  {
    long temp = GetOutputInformation_74(id0);

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Update_75(int id0);
  public void Update(int id0)
  {
    Update_75(id0);
  }

  private native void Update_76();
  public void Update()
  {
    Update_76();
  }

  private native int Update_77(int id0,vtkInformationVector id1);
  public int Update(int id0,vtkInformationVector id1)
  {
    return Update_77(id0,id1);
  }

  private native int Update_78(vtkInformation id0);
  public int Update(vtkInformation id0)
  {
    return Update_78(id0);
  }

  private native int UpdatePiece_79(int id0,int id1,int id2,int id3[]);
  public int UpdatePiece(int id0,int id1,int id2,int id3[])
  {
    return UpdatePiece_79(id0,id1,id2,id3);
  }

  private native int UpdateExtent_80(int id0[]);
  public int UpdateExtent(int id0[])
  {
    return UpdateExtent_80(id0);
  }

  private native int UpdateTimeStep_81(double id0,int id1,int id2,int id3,int id4[]);
  public int UpdateTimeStep(double id0,int id1,int id2,int id3,int id4[])
  {
    return UpdateTimeStep_81(id0,id1,id2,id3,id4);
  }

  private native void UpdateInformation_82();
  public void UpdateInformation()
  {
    UpdateInformation_82();
  }

  private native void UpdateDataObject_83();
  public void UpdateDataObject()
  {
    UpdateDataObject_83();
  }

  private native void PropagateUpdateExtent_84();
  public void PropagateUpdateExtent()
  {
    PropagateUpdateExtent_84();
  }

  private native void UpdateWholeExtent_85();
  public void UpdateWholeExtent()
  {
    UpdateWholeExtent_85();
  }

  private native void SetReleaseDataFlag_86(int id0);
  public void SetReleaseDataFlag(int id0)
  {
    SetReleaseDataFlag_86(id0);
  }

  private native int GetReleaseDataFlag_87();
  public int GetReleaseDataFlag()
  {
    return GetReleaseDataFlag_87();
  }

  private native void ReleaseDataFlagOn_88();
  public void ReleaseDataFlagOn()
  {
    ReleaseDataFlagOn_88();
  }

  private native void ReleaseDataFlagOff_89();
  public void ReleaseDataFlagOff()
  {
    ReleaseDataFlagOff_89();
  }

  private native int UpdateExtentIsEmpty_90(vtkInformation id0,vtkDataObject id1);
  public int UpdateExtentIsEmpty(vtkInformation id0,vtkDataObject id1)
  {
    return UpdateExtentIsEmpty_90(id0,id1);
  }

  private native int UpdateExtentIsEmpty_91(vtkInformation id0,int id1);
  public int UpdateExtentIsEmpty(vtkInformation id0,int id1)
  {
    return UpdateExtentIsEmpty_91(id0,id1);
  }

  private native void SetDefaultExecutivePrototype_92(vtkExecutive id0);
  public void SetDefaultExecutivePrototype(vtkExecutive id0)
  {
    SetDefaultExecutivePrototype_92(id0);
  }

  private native int[] GetUpdateExtent_93();
  public int[] GetUpdateExtent()
  {
    return GetUpdateExtent_93();
  }

  private native int[] GetUpdateExtent_94(int id0);
  public int[] GetUpdateExtent(int id0)
  {
    return GetUpdateExtent_94(id0);
  }

  private native void GetUpdateExtent_95(int id0[]);
  public void GetUpdateExtent(int id0[])
  {
    GetUpdateExtent_95(id0);
  }

  private native void GetUpdateExtent_96(int id0,int id1[]);
  public void GetUpdateExtent(int id0,int id1[])
  {
    GetUpdateExtent_96(id0,id1);
  }

  private native int GetUpdatePiece_97();
  public int GetUpdatePiece()
  {
    return GetUpdatePiece_97();
  }

  private native int GetUpdatePiece_98(int id0);
  public int GetUpdatePiece(int id0)
  {
    return GetUpdatePiece_98(id0);
  }

  private native int GetUpdateNumberOfPieces_99();
  public int GetUpdateNumberOfPieces()
  {
    return GetUpdateNumberOfPieces_99();
  }

  private native int GetUpdateNumberOfPieces_100(int id0);
  public int GetUpdateNumberOfPieces(int id0)
  {
    return GetUpdateNumberOfPieces_100(id0);
  }

  private native int GetUpdateGhostLevel_101();
  public int GetUpdateGhostLevel()
  {
    return GetUpdateGhostLevel_101();
  }

  private native int GetUpdateGhostLevel_102(int id0);
  public int GetUpdateGhostLevel(int id0)
  {
    return GetUpdateGhostLevel_102(id0);
  }

  private native void SetProgressObserver_103(vtkProgressObserver id0);
  public void SetProgressObserver(vtkProgressObserver id0)
  {
    SetProgressObserver_103(id0);
  }

  private native long GetProgressObserver_104();
  public vtkProgressObserver GetProgressObserver()
  {
    long temp = GetProgressObserver_104();

    if (temp == 0) return null;
    return (vtkProgressObserver)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetNoPriorTemporalAccessInformationKey_105(int id0);
  public void SetNoPriorTemporalAccessInformationKey(int id0)
  {
    SetNoPriorTemporalAccessInformationKey_105(id0);
  }

  private native void SetNoPriorTemporalAccessInformationKey_106();
  public void SetNoPriorTemporalAccessInformationKey()
  {
    SetNoPriorTemporalAccessInformationKey_106();
  }

  private native void RemoveNoPriorTemporalAccessInformationKey_107();
  public void RemoveNoPriorTemporalAccessInformationKey()
  {
    RemoveNoPriorTemporalAccessInformationKey_107();
  }

  public vtkAlgorithm() { super(); }

  public vtkAlgorithm(long id) { super(id); }
  public native long   VTKInit();

}
