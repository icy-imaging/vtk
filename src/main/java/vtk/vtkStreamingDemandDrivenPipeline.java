// java wrapper for vtkStreamingDemandDrivenPipeline object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStreamingDemandDrivenPipeline extends vtkDemandDrivenPipeline
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

  private native int Update_4();
  public int Update()
  {
    return Update_4();
  }

  private native int Update_5(int id0);
  public int Update(int id0)
  {
    return Update_5(id0);
  }

  private native int UpdateWholeExtent_6();
  public int UpdateWholeExtent()
  {
    return UpdateWholeExtent_6();
  }

  private native int Update_7(int id0,vtkInformationVector id1);
  public int Update(int id0,vtkInformationVector id1)
  {
    return Update_7(id0,id1);
  }

  private native int PropagateUpdateExtent_8(int id0);
  public int PropagateUpdateExtent(int id0)
  {
    return PropagateUpdateExtent_8(id0);
  }

  private native int PropagateTime_9(int id0);
  public int PropagateTime(int id0)
  {
    return PropagateTime_9(id0);
  }

  private native int UpdateTimeDependentInformation_10(int id0);
  public int UpdateTimeDependentInformation(int id0)
  {
    return UpdateTimeDependentInformation_10(id0);
  }

  private native int SetWholeExtent_11(vtkInformation id0,int id1[]);
  public int SetWholeExtent(vtkInformation id0,int id1[])
  {
    return SetWholeExtent_11(id0,id1);
  }

  private native void GetWholeExtent_12(vtkInformation id0,int id1[]);
  public void GetWholeExtent(vtkInformation id0,int id1[])
  {
    GetWholeExtent_12(id0,id1);
  }

  private native int[] GetWholeExtent_13(vtkInformation id0);
  public int[] GetWholeExtent(vtkInformation id0)
  {
    return GetWholeExtent_13(id0);
  }

  private native int SetRequestExactExtent_14(int id0,int id1);
  public int SetRequestExactExtent(int id0,int id1)
  {
    return SetRequestExactExtent_14(id0,id1);
  }

  private native int GetRequestExactExtent_15(int id0);
  public int GetRequestExactExtent(int id0)
  {
    return GetRequestExactExtent_15(id0);
  }

  private native long REQUEST_UPDATE_EXTENT_16();
  public vtkInformationRequestKey REQUEST_UPDATE_EXTENT()
  {
    long temp = REQUEST_UPDATE_EXTENT_16();

    if (temp == 0) return null;
    return (vtkInformationRequestKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long REQUEST_UPDATE_TIME_17();
  public vtkInformationRequestKey REQUEST_UPDATE_TIME()
  {
    long temp = REQUEST_UPDATE_TIME_17();

    if (temp == 0) return null;
    return (vtkInformationRequestKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long REQUEST_TIME_DEPENDENT_INFORMATION_18();
  public vtkInformationRequestKey REQUEST_TIME_DEPENDENT_INFORMATION()
  {
    long temp = REQUEST_TIME_DEPENDENT_INFORMATION_18();

    if (temp == 0) return null;
    return (vtkInformationRequestKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long CONTINUE_EXECUTING_19();
  public vtkInformationIntegerKey CONTINUE_EXECUTING()
  {
    long temp = CONTINUE_EXECUTING_19();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long UPDATE_EXTENT_INITIALIZED_20();
  public vtkInformationIntegerKey UPDATE_EXTENT_INITIALIZED()
  {
    long temp = UPDATE_EXTENT_INITIALIZED_20();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long UPDATE_EXTENT_21();
  public vtkInformationIntegerVectorKey UPDATE_EXTENT()
  {
    long temp = UPDATE_EXTENT_21();

    if (temp == 0) return null;
    return (vtkInformationIntegerVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long UPDATE_PIECE_NUMBER_22();
  public vtkInformationIntegerKey UPDATE_PIECE_NUMBER()
  {
    long temp = UPDATE_PIECE_NUMBER_22();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long UPDATE_NUMBER_OF_PIECES_23();
  public vtkInformationIntegerKey UPDATE_NUMBER_OF_PIECES()
  {
    long temp = UPDATE_NUMBER_OF_PIECES_23();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long UPDATE_NUMBER_OF_GHOST_LEVELS_24();
  public vtkInformationIntegerKey UPDATE_NUMBER_OF_GHOST_LEVELS()
  {
    long temp = UPDATE_NUMBER_OF_GHOST_LEVELS_24();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long COMBINED_UPDATE_EXTENT_25();
  public vtkInformationIntegerVectorKey COMBINED_UPDATE_EXTENT()
  {
    long temp = COMBINED_UPDATE_EXTENT_25();

    if (temp == 0) return null;
    return (vtkInformationIntegerVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long WHOLE_EXTENT_26();
  public vtkInformationIntegerVectorKey WHOLE_EXTENT()
  {
    long temp = WHOLE_EXTENT_26();

    if (temp == 0) return null;
    return (vtkInformationIntegerVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long UNRESTRICTED_UPDATE_EXTENT_27();
  public vtkInformationIntegerKey UNRESTRICTED_UPDATE_EXTENT()
  {
    long temp = UNRESTRICTED_UPDATE_EXTENT_27();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long EXACT_EXTENT_28();
  public vtkInformationIntegerKey EXACT_EXTENT()
  {
    long temp = EXACT_EXTENT_28();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long TIME_STEPS_29();
  public vtkInformationDoubleVectorKey TIME_STEPS()
  {
    long temp = TIME_STEPS_29();

    if (temp == 0) return null;
    return (vtkInformationDoubleVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long TIME_RANGE_30();
  public vtkInformationDoubleVectorKey TIME_RANGE()
  {
    long temp = TIME_RANGE_30();

    if (temp == 0) return null;
    return (vtkInformationDoubleVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long UPDATE_TIME_STEP_31();
  public vtkInformationDoubleKey UPDATE_TIME_STEP()
  {
    long temp = UPDATE_TIME_STEP_31();

    if (temp == 0) return null;
    return (vtkInformationDoubleKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long TIME_DEPENDENT_INFORMATION_32();
  public vtkInformationIntegerKey TIME_DEPENDENT_INFORMATION()
  {
    long temp = TIME_DEPENDENT_INFORMATION_32();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long BOUNDS_33();
  public vtkInformationDoubleVectorKey BOUNDS()
  {
    long temp = BOUNDS_33();

    if (temp == 0) return null;
    return (vtkInformationDoubleVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long NO_PRIOR_TEMPORAL_ACCESS_34();
  public vtkInformationIntegerKey NO_PRIOR_TEMPORAL_ACCESS()
  {
    long temp = NO_PRIOR_TEMPORAL_ACCESS_34();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetUpdateExtent_35(vtkInformation id0,int id1[]);
  public void GetUpdateExtent(vtkInformation id0,int id1[])
  {
    GetUpdateExtent_35(id0,id1);
  }

  private native int GetUpdatePiece_36(vtkInformation id0);
  public int GetUpdatePiece(vtkInformation id0)
  {
    return GetUpdatePiece_36(id0);
  }

  private native int GetUpdateNumberOfPieces_37(vtkInformation id0);
  public int GetUpdateNumberOfPieces(vtkInformation id0)
  {
    return GetUpdateNumberOfPieces_37(id0);
  }

  private native int GetUpdateGhostLevel_38(vtkInformation id0);
  public int GetUpdateGhostLevel(vtkInformation id0)
  {
    return GetUpdateGhostLevel_38(id0);
  }

  public vtkStreamingDemandDrivenPipeline() { super(); }

  public vtkStreamingDemandDrivenPipeline(long id) { super(id); }
  public native long   VTKInit();

}
