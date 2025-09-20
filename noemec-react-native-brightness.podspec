require 'json'
package = JSON.parse(File.read(File.join(__dir__, 'package.json')))

Pod::Spec.new do |s|
  s.name         = 'noemec-react-native-brightness'
  s.version      = package['version']
  s.summary      = package['description'] || 'Brightness control for React Native'
  s.license      = package['license'] || 'MIT'
  s.homepage     = package['homepage'] || (package['repository'] && package['repository']['url'])
  s.author       = { 'JoralmoPro' => 'joralmopro@gmail.com' }

  s.platform     = :ios, '13.4'
  s.source       = { :path => '.' }
  s.source_files = 'ios/**/*.{h,m,mm,swift}'
  s.requires_arc = true
  s.swift_version = '5.9'

  s.dependency 'React-Core'
end
