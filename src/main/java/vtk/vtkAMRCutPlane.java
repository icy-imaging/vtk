// java wrapper for vtkAMRCutPlane object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAMRCutPlane extends vtkMultiBlockDataSetAlgorithm
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

  private native void SetCenter_4(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_4(id0,id1,id2);
  }

  private native void SetCenter_5(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_5(id0);
  }

  private native void SetNormal_6(double id0,double id1,double id2);
  public void SetNormal(double id0,double id1,double id2)
  {
    SetNormal_6(id0,id1,id2);
  }

  private native void SetNormal_7(double id0[]);
  public void SetNormal(double id0[])
  {
    SetNormal_7(id0);
  }

  private native void SetLevelOfResolution_8(int id0);
  public void SetLevelOfResolution(int id0)
  {
    SetLevelOfResolution_8(id0);
  }

  private native int GetLevelOfResolution_9();
  public int GetLevelOfResolution()
  {
    return GetLevelOfResolution_9();
  }

  private native void SetUseNativeCutter_10(boolean id0);
  public void SetUseNativeCutter(boolean id0)
  {
    SetUseNativeCutter_10(id0);
  }

  private native boolean GetUseNativeCutter_11();
  public boolean GetUseNativeCutter()
  {
    return GetUseNativeCutter_11();
  }

  private native void UseNativeCutterOn_12();
  public void UseNativeCutterOn()
  {
    UseNativeCutterOn_12();
  }

  private native void UseNativeCutterOff_13();
  public void UseNativeCutterOff()
  {
    UseNativeCutterOff_13();
  }

  private native void SetController_14(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_14(id0);
  }

  private native long GetController_15();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_15();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int FillInputPortInformation_16(int id0,vtkInformation id1);
  public int FillInputPortInformation(int id0,vtkInformation id1)
  {
    return FillInputPortInformation_16(id0,id1);
  }

  private native int FillOutputPortInformation_17(int id0,vtkInformation id1);
  public int FillOutputPortInformation(int id0,vtkInformation id1)
  {
    return FillOutputPortInformation_17(id0,id1);
  }

  private native void SetInitialRequest_18(boolean id0);
  public void SetInitialRequest(boolean id0)
  {
    SetInitialRequest_18(id0);
  }

  public vtkAMRCutPlane() { super(); }

  public vtkAMRCutPlane(long id) { super(id); }
  public native long   VTKInit();

}
