// java wrapper for vtkImageBlend object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageBlend extends vtkThreadedImageAlgorithm
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

  private native void ReplaceNthInputConnection_4(int id0,vtkAlgorithmOutput id1);
  public void ReplaceNthInputConnection(int id0,vtkAlgorithmOutput id1)
  {
    ReplaceNthInputConnection_4(id0,id1);
  }

  private native void SetInputData_5(int id0,vtkDataObject id1);
  public void SetInputData(int id0,vtkDataObject id1)
  {
    SetInputData_5(id0,id1);
  }

  private native void SetInputData_6(vtkDataObject id0);
  public void SetInputData(vtkDataObject id0)
  {
    SetInputData_6(id0);
  }

  private native long GetInput_7(int id0);
  public vtkDataObject GetInput(int id0)
  {
    long temp = GetInput_7(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_8();
  public vtkDataObject GetInput()
  {
    long temp = GetInput_8();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfInputs_9();
  public int GetNumberOfInputs()
  {
    return GetNumberOfInputs_9();
  }

  private native void SetOpacity_10(int id0,double id1);
  public void SetOpacity(int id0,double id1)
  {
    SetOpacity_10(id0,id1);
  }

  private native double GetOpacity_11(int id0);
  public double GetOpacity(int id0)
  {
    return GetOpacity_11(id0);
  }

  private native void SetStencilConnection_12(vtkAlgorithmOutput id0);
  public void SetStencilConnection(vtkAlgorithmOutput id0)
  {
    SetStencilConnection_12(id0);
  }

  private native void SetStencilData_13(vtkImageStencilData id0);
  public void SetStencilData(vtkImageStencilData id0)
  {
    SetStencilData_13(id0);
  }

  private native long GetStencil_14();
  public vtkImageStencilData GetStencil()
  {
    long temp = GetStencil_14();

    if (temp == 0) return null;
    return (vtkImageStencilData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBlendMode_15(int id0);
  public void SetBlendMode(int id0)
  {
    SetBlendMode_15(id0);
  }

  private native int GetBlendModeMinValue_16();
  public int GetBlendModeMinValue()
  {
    return GetBlendModeMinValue_16();
  }

  private native int GetBlendModeMaxValue_17();
  public int GetBlendModeMaxValue()
  {
    return GetBlendModeMaxValue_17();
  }

  private native int GetBlendMode_18();
  public int GetBlendMode()
  {
    return GetBlendMode_18();
  }

  private native void SetBlendModeToNormal_19();
  public void SetBlendModeToNormal()
  {
    SetBlendModeToNormal_19();
  }

  private native void SetBlendModeToCompound_20();
  public void SetBlendModeToCompound()
  {
    SetBlendModeToCompound_20();
  }

  private native byte[] GetBlendModeAsString_21();
  public String GetBlendModeAsString()
  {
    return new String(GetBlendModeAsString_21(), StandardCharsets.UTF_8);
  }

  private native void SetBlendAlpha_22(int id0);
  public void SetBlendAlpha(int id0)
  {
    SetBlendAlpha_22(id0);
  }

  private native int GetBlendAlpha_23();
  public int GetBlendAlpha()
  {
    return GetBlendAlpha_23();
  }

  private native void BlendAlphaOn_24();
  public void BlendAlphaOn()
  {
    BlendAlphaOn_24();
  }

  private native void BlendAlphaOff_25();
  public void BlendAlphaOff()
  {
    BlendAlphaOff_25();
  }

  private native void SetCompoundThreshold_26(double id0);
  public void SetCompoundThreshold(double id0)
  {
    SetCompoundThreshold_26(id0);
  }

  private native double GetCompoundThreshold_27();
  public double GetCompoundThreshold()
  {
    return GetCompoundThreshold_27();
  }

  private native void SetCompoundAlpha_28(int id0);
  public void SetCompoundAlpha(int id0)
  {
    SetCompoundAlpha_28(id0);
  }

  private native int GetCompoundAlpha_29();
  public int GetCompoundAlpha()
  {
    return GetCompoundAlpha_29();
  }

  private native void CompoundAlphaOn_30();
  public void CompoundAlphaOn()
  {
    CompoundAlphaOn_30();
  }

  private native void CompoundAlphaOff_31();
  public void CompoundAlphaOff()
  {
    CompoundAlphaOff_31();
  }

  public vtkImageBlend() { super(); }

  public vtkImageBlend(long id) { super(id); }
  public native long   VTKInit();

}
