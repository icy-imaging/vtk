// java wrapper for vtkImageChangeInformation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageChangeInformation extends vtkImageAlgorithm
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

  private native void SetInformationInputData_4(vtkImageData id0);
  public void SetInformationInputData(vtkImageData id0)
  {
    SetInformationInputData_4(id0);
  }

  private native long GetInformationInput_5();
  public vtkImageData GetInformationInput()
  {
    long temp = GetInformationInput_5();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOutputExtentStart_6(int id0,int id1,int id2);
  public void SetOutputExtentStart(int id0,int id1,int id2)
  {
    SetOutputExtentStart_6(id0,id1,id2);
  }

  private native void SetOutputExtentStart_7(int id0[]);
  public void SetOutputExtentStart(int id0[])
  {
    SetOutputExtentStart_7(id0);
  }

  private native int[] GetOutputExtentStart_8();
  public int[] GetOutputExtentStart()
  {
    return GetOutputExtentStart_8();
  }

  private native void SetOutputSpacing_9(double id0,double id1,double id2);
  public void SetOutputSpacing(double id0,double id1,double id2)
  {
    SetOutputSpacing_9(id0,id1,id2);
  }

  private native void SetOutputSpacing_10(double id0[]);
  public void SetOutputSpacing(double id0[])
  {
    SetOutputSpacing_10(id0);
  }

  private native double[] GetOutputSpacing_11();
  public double[] GetOutputSpacing()
  {
    return GetOutputSpacing_11();
  }

  private native double[] GetOutputDirection_12();
  public double[] GetOutputDirection()
  {
    return GetOutputDirection_12();
  }

  private native void SetOutputOrigin_13(double id0,double id1,double id2);
  public void SetOutputOrigin(double id0,double id1,double id2)
  {
    SetOutputOrigin_13(id0,id1,id2);
  }

  private native void SetOutputOrigin_14(double id0[]);
  public void SetOutputOrigin(double id0[])
  {
    SetOutputOrigin_14(id0);
  }

  private native double[] GetOutputOrigin_15();
  public double[] GetOutputOrigin()
  {
    return GetOutputOrigin_15();
  }

  private native void SetCenterImage_16(int id0);
  public void SetCenterImage(int id0)
  {
    SetCenterImage_16(id0);
  }

  private native void CenterImageOn_17();
  public void CenterImageOn()
  {
    CenterImageOn_17();
  }

  private native void CenterImageOff_18();
  public void CenterImageOff()
  {
    CenterImageOff_18();
  }

  private native int GetCenterImage_19();
  public int GetCenterImage()
  {
    return GetCenterImage_19();
  }

  private native void SetExtentTranslation_20(int id0,int id1,int id2);
  public void SetExtentTranslation(int id0,int id1,int id2)
  {
    SetExtentTranslation_20(id0,id1,id2);
  }

  private native void SetExtentTranslation_21(int id0[]);
  public void SetExtentTranslation(int id0[])
  {
    SetExtentTranslation_21(id0);
  }

  private native int[] GetExtentTranslation_22();
  public int[] GetExtentTranslation()
  {
    return GetExtentTranslation_22();
  }

  private native void SetSpacingScale_23(double id0,double id1,double id2);
  public void SetSpacingScale(double id0,double id1,double id2)
  {
    SetSpacingScale_23(id0,id1,id2);
  }

  private native void SetSpacingScale_24(double id0[]);
  public void SetSpacingScale(double id0[])
  {
    SetSpacingScale_24(id0);
  }

  private native double[] GetSpacingScale_25();
  public double[] GetSpacingScale()
  {
    return GetSpacingScale_25();
  }

  private native void SetOriginTranslation_26(double id0,double id1,double id2);
  public void SetOriginTranslation(double id0,double id1,double id2)
  {
    SetOriginTranslation_26(id0,id1,id2);
  }

  private native void SetOriginTranslation_27(double id0[]);
  public void SetOriginTranslation(double id0[])
  {
    SetOriginTranslation_27(id0);
  }

  private native double[] GetOriginTranslation_28();
  public double[] GetOriginTranslation()
  {
    return GetOriginTranslation_28();
  }

  private native void SetOriginScale_29(double id0,double id1,double id2);
  public void SetOriginScale(double id0,double id1,double id2)
  {
    SetOriginScale_29(id0,id1,id2);
  }

  private native void SetOriginScale_30(double id0[]);
  public void SetOriginScale(double id0[])
  {
    SetOriginScale_30(id0);
  }

  private native double[] GetOriginScale_31();
  public double[] GetOriginScale()
  {
    return GetOriginScale_31();
  }

  public vtkImageChangeInformation() { super(); }

  public vtkImageChangeInformation(long id) { super(id); }
  public native long   VTKInit();

}
