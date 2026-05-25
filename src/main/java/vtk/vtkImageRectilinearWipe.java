// java wrapper for vtkImageRectilinearWipe object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageRectilinearWipe extends vtkThreadedImageAlgorithm
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

  private native void SetPosition_4(int id0,int id1);
  public void SetPosition(int id0,int id1)
  {
    SetPosition_4(id0,id1);
  }

  private native void SetPosition_5(int id0[]);
  public void SetPosition(int id0[])
  {
    SetPosition_5(id0);
  }

  private native int[] GetPosition_6();
  public int[] GetPosition()
  {
    return GetPosition_6();
  }

  private native void SetAxis_7(int id0,int id1);
  public void SetAxis(int id0,int id1)
  {
    SetAxis_7(id0,id1);
  }

  private native void SetAxis_8(int id0[]);
  public void SetAxis(int id0[])
  {
    SetAxis_8(id0);
  }

  private native int[] GetAxis_9();
  public int[] GetAxis()
  {
    return GetAxis_9();
  }

  private native void SetInput1Data_10(vtkDataObject id0);
  public void SetInput1Data(vtkDataObject id0)
  {
    SetInput1Data_10(id0);
  }

  private native void SetInput2Data_11(vtkDataObject id0);
  public void SetInput2Data(vtkDataObject id0)
  {
    SetInput2Data_11(id0);
  }

  private native void SetWipe_12(int id0);
  public void SetWipe(int id0)
  {
    SetWipe_12(id0);
  }

  private native int GetWipeMinValue_13();
  public int GetWipeMinValue()
  {
    return GetWipeMinValue_13();
  }

  private native int GetWipeMaxValue_14();
  public int GetWipeMaxValue()
  {
    return GetWipeMaxValue_14();
  }

  private native int GetWipe_15();
  public int GetWipe()
  {
    return GetWipe_15();
  }

  private native void SetWipeToQuad_16();
  public void SetWipeToQuad()
  {
    SetWipeToQuad_16();
  }

  private native void SetWipeToHorizontal_17();
  public void SetWipeToHorizontal()
  {
    SetWipeToHorizontal_17();
  }

  private native void SetWipeToVertical_18();
  public void SetWipeToVertical()
  {
    SetWipeToVertical_18();
  }

  private native void SetWipeToLowerLeft_19();
  public void SetWipeToLowerLeft()
  {
    SetWipeToLowerLeft_19();
  }

  private native void SetWipeToLowerRight_20();
  public void SetWipeToLowerRight()
  {
    SetWipeToLowerRight_20();
  }

  private native void SetWipeToUpperLeft_21();
  public void SetWipeToUpperLeft()
  {
    SetWipeToUpperLeft_21();
  }

  private native void SetWipeToUpperRight_22();
  public void SetWipeToUpperRight()
  {
    SetWipeToUpperRight_22();
  }

  public vtkImageRectilinearWipe() { super(); }

  public vtkImageRectilinearWipe(long id) { super(id); }
  public native long   VTKInit();

}
