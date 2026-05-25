// java wrapper for vtkExecutive object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExecutive extends vtkObject
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

  private native long GetAlgorithm_4();
  public vtkAlgorithm GetAlgorithm()
  {
    long temp = GetAlgorithm_4();

    if (temp == 0) return null;
    return (vtkAlgorithm)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int UpdateInformation_5();
  public int UpdateInformation()
  {
    return UpdateInformation_5();
  }

  private native int Update_6();
  public int Update()
  {
    return Update_6();
  }

  private native int Update_7(int id0);
  public int Update(int id0)
  {
    return Update_7(id0);
  }

  private native int GetNumberOfInputPorts_8();
  public int GetNumberOfInputPorts()
  {
    return GetNumberOfInputPorts_8();
  }

  private native int GetNumberOfOutputPorts_9();
  public int GetNumberOfOutputPorts()
  {
    return GetNumberOfOutputPorts_9();
  }

  private native int GetNumberOfInputConnections_10(int id0);
  public int GetNumberOfInputConnections(int id0)
  {
    return GetNumberOfInputConnections_10(id0);
  }

  private native long GetOutputInformation_11(int id0);
  public vtkInformation GetOutputInformation(int id0)
  {
    long temp = GetOutputInformation_11(id0);

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutputInformation_12();
  public vtkInformationVector GetOutputInformation()
  {
    long temp = GetOutputInformation_12();

    if (temp == 0) return null;
    return (vtkInformationVector)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInputInformation_13(int id0,int id1);
  public vtkInformation GetInputInformation(int id0,int id1)
  {
    long temp = GetInputInformation_13(id0,id1);

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInputInformation_14(int id0);
  public vtkInformationVector GetInputInformation(int id0)
  {
    long temp = GetInputInformation_14(id0);

    if (temp == 0) return null;
    return (vtkInformationVector)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInputExecutive_15(int id0,int id1);
  public vtkExecutive GetInputExecutive(int id0,int id1)
  {
    long temp = GetInputExecutive_15(id0,id1);

    if (temp == 0) return null;
    return (vtkExecutive)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutputData_16(int id0);
  public vtkDataObject GetOutputData(int id0)
  {
    long temp = GetOutputData_16(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOutputData_17(int id0,vtkDataObject id1,vtkInformation id2);
  public void SetOutputData(int id0,vtkDataObject id1,vtkInformation id2)
  {
    SetOutputData_17(id0,id1,id2);
  }

  private native void SetOutputData_18(int id0,vtkDataObject id1);
  public void SetOutputData(int id0,vtkDataObject id1)
  {
    SetOutputData_18(id0,id1);
  }

  private native long GetInputData_19(int id0,int id1);
  public vtkDataObject GetInputData(int id0,int id1)
  {
    long temp = GetInputData_19(id0,id1);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSharedOutputInformation_20(vtkInformationVector id0);
  public void SetSharedOutputInformation(vtkInformationVector id0)
  {
    SetSharedOutputInformation_20(id0);
  }

  private native boolean UsesGarbageCollector_21();
  public boolean UsesGarbageCollector()
  {
    return UsesGarbageCollector_21();
  }

  private native long PRODUCER_22();
  public vtkInformationExecutivePortKey PRODUCER()
  {
    long temp = PRODUCER_22();

    if (temp == 0) return null;
    return (vtkInformationExecutivePortKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long CONSUMERS_23();
  public vtkInformationExecutivePortVectorKey CONSUMERS()
  {
    long temp = CONSUMERS_23();

    if (temp == 0) return null;
    return (vtkInformationExecutivePortVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long FROM_OUTPUT_PORT_24();
  public vtkInformationIntegerKey FROM_OUTPUT_PORT()
  {
    long temp = FROM_OUTPUT_PORT_24();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ALGORITHM_BEFORE_FORWARD_25();
  public vtkInformationIntegerKey ALGORITHM_BEFORE_FORWARD()
  {
    long temp = ALGORITHM_BEFORE_FORWARD_25();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ALGORITHM_AFTER_FORWARD_26();
  public vtkInformationIntegerKey ALGORITHM_AFTER_FORWARD()
  {
    long temp = ALGORITHM_AFTER_FORWARD_26();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ALGORITHM_DIRECTION_27();
  public vtkInformationIntegerKey ALGORITHM_DIRECTION()
  {
    long temp = ALGORITHM_DIRECTION_27();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long FORWARD_DIRECTION_28();
  public vtkInformationIntegerKey FORWARD_DIRECTION()
  {
    long temp = FORWARD_DIRECTION_28();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long KEYS_TO_COPY_29();
  public vtkInformationKeyVectorKey KEYS_TO_COPY()
  {
    long temp = KEYS_TO_COPY_29();

    if (temp == 0) return null;
    return (vtkInformationKeyVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkExecutive() { super(); }

  public vtkExecutive(long id) { super(id); }

}
